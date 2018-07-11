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
package bak.pcj.adapter;

import bak.pcj.list.IntListIterator;
import bak.pcj.util.Exceptions;
import java.util.ListIterator;

/**
 *  This class represents adaptions of Java Collections Framework
 *  list iterators to primitive list iterators over int values.
 *
 *  <p>
 *  Adapters from JCF collections to primitive collections will
 *  fail if the JCF collection contains <tt>null</tt> values or
 *  values of the wrong class. However, adapters are not fast
 *  failing in the case that the underlying collection should
 *  contain illegal values. To implement fast failure would require
 *  every operation to check every element of the underlying
 *  collection before doing anything. Instead validation methods
 *  are provided. They can be called using the assertion facility
 *  in the client code:
 *  <pre>
 *      CollectionToIntCollectionAdapter s;
 *      ...
 *      <b>assert</b> s.validate();
 *  </pre>
 *  or by letting the adapter throw an exception on illegal values:
 *  <pre>
 *      CollectionToIntCollectionAdapter s;
 *      ...
 *      s.evalidate();  // Throws an exception on illegal values
 *  </pre>
 *  Either way, validation must be invoked directly by the client
 *  code.
 *
 *  @author     S&oslash;ren Bak
 *  @version    1.2     20-08-2003 23:17
 *  @since      1.0
 */
public class ListIteratorToIntListIteratorAdapter implements IntListIterator {

    /** The underlying iterator. */
    protected ListIterator iterator;

    /**
     *  Creates a new adaption of a list iterator to a primitive 
     *  list iterator over int values.
     *
     *  @param      iterator
     *              the iterator to adapt to a primitive iterator.
     *
     *  @throws     NullPointerException
     *              if <tt>iterator</tt> is <tt>null</tt>.
     */
    public ListIteratorToIntListIteratorAdapter(ListIterator iterator) {
        if (iterator == null)
            Exceptions.nullArgument("iterator");
        this.iterator = iterator;
    }

    public void add(int v)
    { iterator.add(new Integer(v)); }

    public boolean hasNext()
    { return iterator.hasNext(); }

    public boolean hasPrevious()
    { return iterator.hasPrevious(); }

    public int next()
    { return ((Integer)iterator.next()).intValue(); }

    public int nextIndex()
    { return iterator.nextIndex(); }

    public int previous()
    { return ((Integer)iterator.previous()).intValue(); }

    public int previousIndex()
    { return iterator.previousIndex(); }

    public void remove()
    { iterator.remove(); }

    public void set(int v)
    { iterator.set(new Integer(v)); }

}