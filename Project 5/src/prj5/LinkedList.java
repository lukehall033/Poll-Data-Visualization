/**
 * Virginia Tech Honor Code Pledge:
 *
 * As a Hokie, I will conduct myself with honor
 * and integrity at all times.
 * I will not lie, cheat, or steal, nor will I
 * accept the actions of those who do.
 * -- Allison Woods (awoods99)
 * --
 * --
 */
package prj5;

import java.util.Iterator;

/**
 * 
 * 
 * 
 * @author Luke Hall (lukeh)
 * @author Allison Woods (awoods99)
 * @version 11/15/2019
 * @param <T> generic
 */
public class LinkedList<T> implements Iterable<T> {

    /**
     * 
     * Add class description here.
     * 
     * @author
     * @author Luke Hall (lukeh)
     * @author Allison Woods (awoods99)
     * @version 11/15/2019
     */
    private static class Node<T> {
        private T data;
        private Node<T> next;

        /**
         * 
         * 
         * @param nodeData
         */
        public Node(T nodeData) {
            data = nodeData;
            next = null;
        }


        /**
         * 
         * 
         * @return
         */
        public Node<T> getNext() {
            return next;
        }


        /**
         * 
         * 
         * @return
         */
        public T getData() {
            return data;
        }
    }

    /**
     * f
     */
    private int size;
    /**
     * f
     */
    private Node<T> head;


    /**
     * 
     */
    public LinkedList() {
        size = 0;
        head = null;
    }


    /**
     * 
     * 
     * @return int size
     * 
     */
    public int getSize() {
        return size;
    }


    /**
     * 
     * 
     * @return boolean bool
     */
    public boolean isEmpty() {
        return (size == 0);
    }


    /**
     * 
     */
    public void clear() {
        size = 0;
        head = null;
    }


    /**
     * 
     * 
     * @param newEntry T
     */
    public void add(T newEntry) {
        if (newEntry != null) {
            if (isEmpty()) {
                head = new Node<T>(newEntry);
                size++;
            }
            else {
                Node<T> newNode = new Node<T>(newEntry);
                newNode.next = head;
                head = newNode;
                size++;
            }
        }
    }


    /**
     * 
     */
    public void remove() {
        if (!isEmpty()) {
            head = head.getNext();
            size--;
        }
    }


    /**
     * 
     * 
     * @param index int
     * @return T info
     */
    public T get(int index) {
        if (!isEmpty())
        {
            int val = 1;
            Node<T> current = head;
            while (val != index) {
                val++;
                current = current.getNext();
            }
            return (current.getData());
        }
        return null;
    }


    /**
     * 
     * 
     * @return String toString
     */
    public String toString() {
//        if (isEmpty())
//        {
//            return "[]";
//        }
//        String result = "[";
//        Node<T> current = head;
//        while (current != null)
//        {
//            result += current.data.toString();
//            current = current.next;
//            if (current != null)
//            {
//                result += ", ";
//            }
//        }
//        result += "]";
//        return result;
        String result = "[";
        Iterator<T> listIterator = iterator();
        while (listIterator.hasNext())
        {
            result += listIterator.next().toString();
            if (listIterator.hasNext())
            {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }


    /**
     * 
     * 
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this);
    }


    /**
     * 
     * Add class description here.
     * 
     * 
     * @author Luke Hall (lukeh)
     * @author Allison Woods (awoods99)
     * @version 11/15/2019
     * @param T thing
     */
    private class LinkedListIterator<A> implements Iterator<T> {
        /**
         * f
         */
        private Node<T> current;

        /**
         * 
         * 
         * @param Llist
         */
        public LinkedListIterator(LinkedList<T> lList) {
            current = lList.head;
        }


        /**
         * 
         * 
         * @return
         */
        public boolean hasNext() {
            return current != null;
        }


        /**
         * 
         * 
         * @return
         */
        public T next() {
            T data = current.getData();
            current = current.getNext();
            return data;
        }
    }
}
