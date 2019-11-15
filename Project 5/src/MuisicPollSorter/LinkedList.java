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
package MuisicPollSorter;

import java.util.Iterator;

/**
 * 
 * 
 * @author
 * @author
 * @author Allison Woods (awoods99)
 * @version 11/15/2019
 */
public class LinkedList<T> implements Iterable<T> {

    /**
     * 
     * Add class description here.
     * 
     * @author
     * @author
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

    private int size;
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
     * @return
     */
    public int getSize() {
        return size;
    }


    /**
     * 
     * 
     * @return
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
     * @param newEntry
     */
    public void add(T newEntry) {
        if (!(newEntry == null)) {
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
     * @param index
     * @return
     */
    public T get(int index) {
        int val = 1;
        Node<T> current = head;
        while (val != index) {
            val++;
            current = current.getNext();
        }
        return (current.getData());
    }


    /**
     * 
     * 
     * @return
     */
    public String toString() {
        return null;
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
     * @author
     * @author
     * @author Allison Woods (awoods99)
     * @version 11/15/2019
     */
    private class LinkedListIterator<A> implements Iterator<T> {
        private LinkedList<T> list;


        /**
         * 
         * 
         * @param Llist
         */
        public LinkedListIterator(LinkedList<T> Llist) {
            list = Llist;
        }


        /**
         * 
         * 
         * @return
         */
        public boolean hasNext() {
            return false;
        }


        /**
         * 
         * 
         * @return
         */
        public T next() {
            return null;
        }
    }
}
