/*
 *  Primitive Collections for Java.
 *  Copyright (C) 2002, 2003  Soren Bak
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package bak.pcj.hash;

import java.io.Serializable;

/**
 *  This class provides a default hash function for
 *  double values. It has been derived from the Java library and
 *  is known to work well in the general case.
 *
 *  @see        Double#hashCode()
 *
 *  @serial     exclude
 *  @author     S&oslash;ren Bak
 *  @version    1.2     2003/5/3
 *  @since      1.0
 */
public class DefaultDoubleHashFunction implements DoubleHashFunction, Serializable {

    /** Default instance of this hash function. */
    public static final DoubleHashFunction INSTANCE = new DefaultDoubleHashFunction();

    /** Default constructor to be invoked by sub-classes. */
    protected DefaultDoubleHashFunction() { }

    public int hash(double v) {
        long longhash = Double.doubleToLongBits(v);
        return (int)(longhash ^ (longhash >>> 32));
    }

}