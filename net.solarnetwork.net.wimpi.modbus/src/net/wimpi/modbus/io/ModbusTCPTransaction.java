//License
/***
 * Java Modbus Library (jamod)
 * Copyright (c) 2002-2004, jamod development team
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the author nor the names of its contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDER AND CONTRIBUTORS ``AS
 * IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ***/
package net.wimpi.modbus.io;

import net.wimpi.modbus.Modbus;
import net.wimpi.modbus.ModbusException;
import net.wimpi.modbus.ModbusIOException;
import net.wimpi.modbus.ModbusSlaveException;
import net.wimpi.modbus.msg.ExceptionResponse;
import net.wimpi.modbus.msg.ModbusRequest;
import net.wimpi.modbus.msg.ModbusResponse;
import net.wimpi.modbus.net.TCPMasterConnection;
import net.wimpi.modbus.util.AtomicCounter;
import net.wimpi.modbus.util.Mutex;

/**
 * Class implementing the <tt>ModbusTransaction</tt>
 * interface.
 *
 * @author Dieter Wimberger
 * @version 1.2rc2 (14/04/2014)
 */
public class ModbusTCPTransaction
    implements ModbusTransaction {

  //class attributes
  private static AtomicCounter c_TransactionID =
      new AtomicCounter(Modbus.DEFAULT_TRANSACTION_ID);

  //instance attributes and associations
  private TCPMasterConnection m_Connection;
  private ModbusTransport m_IO;
  private ModbusRequest m_Request;
  private ModbusResponse m_Response;
  private boolean m_ValidityCheck =
      Modbus.DEFAULT_VALIDITYCHECK;
  private boolean m_Reconnecting = Modbus.DEFAULT_RECONNECTING;
  private int m_Retries = Modbus.DEFAULT_RETRIES;
  private long m_RetryDelayMillis;
  private boolean m_RetryReconnect;

  private Mutex m_TransactionLock = new Mutex();

  /**
   * Constructs a new <tt>ModbusTCPTransaction</tt>
   * instance.
   */
  public ModbusTCPTransaction() {
  }//constructor

  /**
   * Constructs a new <tt>ModbusTCPTransaction</tt>
   * instance with a given <tt>ModbusRequest</tt> to
   * be send when the transaction is executed.
   * <p/>
   *
   * @param request a <tt>ModbusRequest</tt> instance.
   */
  public ModbusTCPTransaction(ModbusRequest request) {
    setRequest(request);
  }//constructor

  /**
   * Constructs a new <tt>ModbusTCPTransaction</tt>
   * instance with a given <tt>TCPMasterConnection</tt> to
   * be used for transactions.
   * <p/>
   *
   * @param con a <tt>TCPMasterConnection</tt> instance.
   */
  public ModbusTCPTransaction(TCPMasterConnection con) {
    setConnection(con);
  }//constructor

  /**
   * Sets the connection on which this <tt>ModbusTransaction</tt>
   * should be executed.<p>
   * An implementation should be able to
   * handle open and closed connections.<br>
   * <p/>
   *
   * @param con a <tt>TCPMasterConnection</tt>.
   */
  public void setConnection(TCPMasterConnection con) {
    m_Connection = con;
    m_IO = con.getModbusTransport();
  }//setConnection

  public void setRequest(ModbusRequest req) {
    m_Request = req;
  }//setRequest

  public ModbusRequest getRequest() {
    return m_Request;
  }//getRequest

  public ModbusResponse getResponse() {
    return m_Response;
  }//getResponse

  public int getTransactionID() {
    return c_TransactionID.get();
  }//getTransactionID

  public void setCheckingValidity(boolean b) {
    m_ValidityCheck = b;
  }//setCheckingValidity

  public boolean isCheckingValidity() {
    return m_ValidityCheck;
  }//isCheckingValidity

  /**
   * Sets the flag that controls whether a
   * connection is openend and closed for
   * <b>each</b> execution or not.
   * <p/>
   *
   * @param b true if reconnecting, false otherwise.
   */
  public void setReconnecting(boolean b) {
    m_Reconnecting = b;
  }//setReconnecting

  /**
   * Tests if the connection will be openend
   * and closed for <b>each</b> execution.
   * <p/>
   *
   * @return true if reconnecting, false otherwise.
   */
  public boolean isReconnecting() {
    return m_Reconnecting;
  }//isReconnecting

  public int getRetries() {
    return m_Retries;
  }//getRetries

  public void setRetries(int num) {
    m_Retries = num;
  }//setRetries

  public void execute() throws ModbusIOException,
      ModbusSlaveException,
      ModbusException {

    //1. check that the transaction can be executed
    assertExecutable();

    try {
      //2. Lock transaction
      /**
       * Note: The way this explicit synchronization is implemented at the moment,
       * there is no ordering of pending threads. The Mutex will simply call notify()
       * and the JVM will handle the rest.
       */
      m_TransactionLock.acquire();

      //Retry transaction m_Retries times, in case of
      //I/O Exception problems.
      int retryCounter = 0;

      while (retryCounter <= m_Retries) {
        //3. open the connection if not connected
        if (!m_Connection.isConnected()) {
          try {
            m_Connection.connect();
            m_IO = m_Connection.getModbusTransport();
          } catch (Exception ex) {
            throw new ModbusIOException("Connecting failed: " +ex.toString());
          }
        }

        try {
          //toggle and set the id
          m_Request.setTransactionID(c_TransactionID.increment());
          //3. write request, and read response
          m_IO.writeMessage(m_Request);
          //read response message
          m_Response = m_IO.readResponse();
          break;
        } catch (ModbusIOException ex) {
          if (retryCounter == m_Retries) {
            throw new ModbusIOException("Executing transaction failed (retried " + m_Retries + " times): " +ex.getMessage());
          } else {
        	if (m_RetryReconnect) {
        		m_Connection.close();
        	}
            retryCounter++;
            if (m_RetryDelayMillis > 0) {
              Thread.sleep(m_RetryDelayMillis);
            }
          }
        }
      }

      //5. deal with "application level" exceptions
      if (m_Response instanceof ExceptionResponse) {
        throw new ModbusSlaveException(
            ((ExceptionResponse) m_Response).getExceptionCode()
        );
      }

      //6. close connection if reconnecting
      if (isReconnecting()) {
        m_Connection.close();
      }

      //7. Check transaction validity
      if (isCheckingValidity()) {
        checkValidity();
      }

    } catch (InterruptedException ex) {
      throw new ModbusIOException("Thread acquiring lock was interrupted.");
    } finally {
      m_TransactionLock.release();
    }
  }//execute

  /**
   * Asserts if this <tt>ModbusTCPTransaction</tt> is
   * executable.
   *
   * @throws ModbusException if the transaction cannot be asserted
   *                         as executable.
   */
  private void assertExecutable()
      throws ModbusException {
    if (m_Request == null ||
        m_Connection == null) {
      throw new ModbusException(
          "Assertion failed, transaction not executable"
      );
    }
  }//assertExecuteable

  /**
   * Checks the validity of the transaction, by
   * checking if the values of the response correspond
   * to the values of the request.
   * Use an override to provide some checks, this method will only return.
   *
   * @throws ModbusException if this transaction has not been valid.
   */
  protected void checkValidity() throws ModbusException {
  }//checkValidity


  /**
   * Get the retry delay.
   * 
   * @return the delay; defaults to {@literal 0} no delay
   */
  public long getRetryDelayMillis() {
    return m_RetryDelayMillis;
  }

  /**
   * Set a retry delay, in milliseconds, to wait between error retries.
   * 
   * @param retryDelayMillis the delay, in milliseconds
   */
  public void setRetryDelayMillis(long retryDelayMillis) {
    this.m_RetryDelayMillis = retryDelayMillis;
  }

  /**
   * Get the retry reconnect mode.
   * 
   * @return {@literal} true to reconnect between error retries, {@literal false}
   * to continue using the same connection; defaults to {@literal false}
   */
  public boolean isRetryReconnect() {
    return m_RetryReconnect;
  }

  /**
   * Toggle the mode to reconnect between error retries.
   * 
   * <p>When enabled, if an IO error occurs while executing a transaction the
   * connection will be closed and reopened.</p>
   * 
   * @param retryReconnect {@literal} true to reconnect between error retries, {@literal false}
   * to continue using the same connection
   */
  public void setRetryReconnect(boolean retryReconnect) {
    this.m_RetryReconnect = retryReconnect;
  }

}//class ModbusTCPTransaction
