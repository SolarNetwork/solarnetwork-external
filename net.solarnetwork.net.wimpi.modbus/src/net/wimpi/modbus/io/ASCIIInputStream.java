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

import java.io.IOException;
import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FilterInputStream;

/**
 * Class implementing a specialized <tt>InputStream</tt> which
 * decodes characters read from the raw stream into bytes.
 *
 * Note that the characters denoting start and end of a frame
 * as given by the specification are exceptions;
 * They are translated to the "virtual" FRAME_START and FRAME_END.
 *
 * @author Dieter Wimberger
 * @version 1.2rc2 (14/04/2014)
 *
 * @see net.wimpi.modbus.io.ModbusASCIITransport#FRAME_START
 * @see net.wimpi.modbus.io.ModbusASCIITransport#FRAME_END
 */
public class ASCIIInputStream
    extends FilterInputStream {

  private static final Logger log = LoggerFactory.getLogger(ASCIIInputStream.class);

  /**
   * Constructs a new <tt>ASCIIInputStream</tt> instance
   * reading from the given <tt>InputStream</tt>.
   *
   * @param in a base input stream to be wrapped.
   */
  public ASCIIInputStream(InputStream in) {
    super(in);
  }//constructor

  /**
   * Reads a byte from the ASCII encoded stream.
   *
   * @return int the byte read from the stream.
   * @throws IOException if an I/O error occurs.
   */
  public int read() throws IOException {
    StringBuffer sbuf = new StringBuffer(2);
    int ch = in.read();
    if(ch == -1) {
      return -1;
    }
    //System.out.println("Read "+ch+ "="+(char)ch);
    sbuf.append((char) ch);
    if (sbuf.charAt(0) == ':') {
      //System.out.println("FRAME START");
      return ModbusASCIITransport.FRAME_START;
    } else {
      if (sbuf.charAt(0) == '\r') {
        if (in.read() == 10) {
          //System.out.println("FRAME END");
          return ModbusASCIITransport.FRAME_END;
        } else {
          //malformed stream
          throw new IOException("Malformed Stream No Frame Delims");
        }
      } else {
        try {
          sbuf.append((char) in.read());
          //System.out.println("Read byte: " + sbuf.toString().toLowerCase());
          return Integer.parseInt(sbuf.toString().toLowerCase(), 16);
        } catch (NumberFormatException ex) {
          //malformed stream
          log.trace(sbuf.toString());
          throw new IOException("Malformed Stream - Wrong Characters");
        }
      }
    }
  }//read

}//class ASCIIInputStream
