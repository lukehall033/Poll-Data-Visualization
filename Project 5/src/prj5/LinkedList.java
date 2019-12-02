/**
 * Virginia Tech Honor Code Pledge:
 *
 * As a Hokie, I will conduct myself with honor
 * and integrity at all times.
 * I will not lie, cheat, or steal, nor will I
 * accept the actions of those who do.
 * -- Allison Woods (awoods99)
 * -- Luke Hall (lukehall033)
 * -- Samantha Khan (ksamantha18)
 */
package prj5;

import java.util.Iterator;

/**
 * 
 * A class of linked nodes defined by an inner node class
 * and an inner iterator class, used to store connected
 * data of objects
 * 
 * @author Luke Hall (lukehall033)
 * @author Allison Woods (awoods99)
 * @author Samantha Khan (ksamantha18)
 * @version 11/15/2019
 * @param <T>
 *            generic
 */
public class LinkedList<T> implements Iterable<T> {

    /**
     * 
     * An inner node class, which creates node
     * objects with data and a next pointer
     * 
     * @author Samantha Khan (ksamantha18)
     * @author Luke Hall (lukehall033)
     * @author Allison Woods (awoods99)
     * @version 11/15/2019
     */
    private static class Node<T> {
        /**
         * the data field of the node
         */
        private T data;
        /**
         * the next pointer of the node
         */
        private Node<T> next;


        /**
         * 
         * the node constructor, which creates a node
         * with the data in the parameter
         * 
         * @param nodeData
         */
        public Node(T nodeData) {
            data = nodeData;
            next = null;
        }


        /**
         * 
         * getter for the next node
         * 
         * @return Node<T> next node
         */
        public Node<T> getNext() {
            return next;
        }


        /**
         * 
         * getter for the nodes data
         * 
         * @return T data
         */
        public T getData() {
            return data;
        }
    }

    /**
     * the size field of the linkedlist
     */
    private int size;
    /**
     * the first node in the linkedList
     */
    private Node<T> head;


    /**
     * The linkedlist constructor, which initially creates
     * an empty list of size 0
     */
    public LinkedList() {
        size = 0;
        head = null;
    }


    /**
     * 
     * a getter for the size of the list
     * 
     * @return int size
     */
    public int getSize() {
        return size;
    }


    /**
     * 
     * this method checks to see if the list is empty
     * 
     * @return boolean bool
     */
    public boolean isEmpty() {
        return (size == 0);
    }


    /**
     * this method clears everything in the list
     */
    public void clear() {
        size = 0;
        head = null;
    }


    /**
     * 
     * this method adds a new node to the list with data passed
     * from the parameter
     * 
     * @param newEntry
     *            T
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
     * this method removes a node from the front of the list
     */
    public void remove() {
        if (!isEmpty()) {
            head = head.getNext();
            size--;
        }
    }


    /**
     * 
     * this method returns the data of the node reffered to
     * by the index thats passed by the parameter
     * 
     * @param index
     *            int
     * @return T info
     */
    public T get(int index) {
        if (!isEmpty()) {
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
     * this method utilizes the iterator to create a
     * string representation of the linkedlist
     * 
     * @return String toString
     */
    public String toString() {
        String result = "[";
        Iterator<T> listIterator = iterator();
        while (listIterator.hasNext()) {
            result += listIterator.next().toString();
            if (listIterator.hasNext()) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }


    /**
     * 
     * this method creates a new iterator from the
     * inner iterator class
     * 
     * @return Iterator<T> iterator
     */
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this);
    }


    /**
     * 
     * This class is an inner iterator that can cycle through
     * a linkedlist
     * 
     * 
     * @author Luke Hall (lukeh)
     * @author Allison Woods (awoods99)
     * @author Samantha Khan (ksamantha18)
     * @version 11/15/2019
     * @param T
     *            generic
     */
    private class LinkedListIterator<A> implements Iterator<T> {
        /**
         * the field representing the current node
         */
        private Node<T> current;


        /**
         * 
         * the linkedlistiterator constructor, which points current
         * to the first node in the linkedlist
         * 
         * @param Llist
         */
        public LinkedListIterator(LinkedList<T> lList) {
            current = lList.head;
        }


        /**
         * 
         * checks if the list has a next value
         * 
         * @return boolean bool
         */
        public boolean hasNext() {
            return current != null;
        }


        /**
         * 
         * this moves the iterator one node and returns the data
         * it was pointing at
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
