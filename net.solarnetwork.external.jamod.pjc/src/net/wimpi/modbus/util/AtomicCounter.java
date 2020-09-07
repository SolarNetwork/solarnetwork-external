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
package net.wimpi.modbus.util;

import net.wimpi.modbus.Modbus;

/**
 * Provides an atomic integer.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version 1.2rc2 (14/04/2014)
 */
public class AtomicCounter {

  private int m_Value;

  /**
   * Constructs a new <tt>AtomicInteger</tt>.
   */
  public AtomicCounter() {
    m_Value = 0;
  }//constructor

  /**
   * Constructs a new <tt>AtomicInteger</tt>
   * with a given initial value.
   *
   * @param value the initial value.
   */
  public AtomicCounter(int value) {
    m_Value = value;
  }//constructor

  /**
   * Increments this <tt>AtomicInteger</tt> by one.
   *
   * @return the resulting value.
   */
  public synchronized int increment() {
    if (m_Value == Modbus.MAX_TRANSACTION_ID) {
      m_Value = 0;
    }
    return ++m_Value;
  }//increment

  /**
   * Returns the value of this <tt>AtomicInteger</tt>.
   * @return the actual value.
   */
  public synchronized int get() {
    return m_Value;
  }//get

}//class AtomicCounter
