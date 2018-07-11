/*
 *  Primitive Collections for Java.
 *  Copyright (C) 2003  Soren Bak
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
package bak.pcj.set;

import bak.pcj.UnmodifiableDoubleCollection;

/**
 *  This class represents unmodifiable sets of double values.
 *
 *  @see        java.util.Collections#unmodifiableSet(java.util.Set)
 *
 *  @author     S&oslash;ren Bak
 *  @version    1.0     2003/17/2
 *  @since      1.0
 */
public class UnmodifiableDoubleSet extends UnmodifiableDoubleCollection implements DoubleSet {

    /**
     *  Creates a new unmodifiable set on an existing
     *  set. The result is a set whose elements and
     *  behaviour is the same as the existing set's except
     *  that the new set cannot be modified.
     *
     *  @param      s
     *              the existing set to make unmodifiable.
     *
     *  @throws     NullPointerException
     *              if <tt>s</tt> is <tt>null</tt>.
     */
    public UnmodifiableDoubleSet(DoubleSet s) {
        super(s);
    }

}