package MuisicPollSorter;
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private static class Node<T>
    {
        private T data;
        private Node<T> next;
        
        public Node(T nodeData)
        {
            data = nodeData;
            next = null;
        }
        
        public Node<T> getNext()
        {
            return next;
        }
        
        public T getData()
        {
            return data;
        }
    }
    
    private int size;
    private Node<T> head;
    
    public LinkedList()
    {
        size = 0;
        head = null;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public boolean isEmpty()
    {
        return (size == 0);
    }
    
    public void clear()
    {
        size = 0;
        head = null;
    }
    
    public void add(T newEntry)
    {
        if (!(newEntry == null))
        {
            if (isEmpty())
            {
                head = new Node<T>(newEntry);
                size++;
            }
            else
            {
                Node<T> newNode = new Node<T>(newEntry);
                newNode.next = head;
                head = newNode;
                size++;
            }
        }
    }
    
    public void remove()
    {
        if (!isEmpty())
        {
            head = head.getNext();
            size--;
        }
    }
    
    public T get(int index)
    {
        int val = 1;
        Node<T> current = head;
        while (val != index)
        {
            val++;
            current = current.getNext();
        }
        return (current.getData());
    }
    
    public String toString()
    {
        return null;
    }
    
    @Override
    public Iterator<T> iterator()
    {
        return new LinkedListIterator<T>(this);
    }
    
    private class LinkedListIterator<A> implements Iterator<T>
    {
        private LinkedList<T> list;
        
        public LinkedListIterator(LinkedList<T> Llist)
        {
            list = Llist;
        }
        
        public boolean hasNext()
        {
            return false;
        }
        
        public T next()
        {
            return null;
        }
    }
}
