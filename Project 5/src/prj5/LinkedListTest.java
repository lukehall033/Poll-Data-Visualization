package prj5;
import java.util.ArrayList;
import student.TestCase;

public class LinkedListTest extends TestCase {

    private LinkedList<Student> list;
    private LinkedList<Student> list2;
    private Student student1;
    private Student student2;
    private Student student3;
    
    public void setUp()
    {
        list = new LinkedList<Student>();
        list2 = new LinkedList<Student>();
        student1 = new Student(1, "11/17/2019 4:19", "CS", "Southeastern", "video games", new ArrayList<String>());
        student2 = new Student(2, "11/17/2019 4:19", "CS", "Southeastern", "video games", new ArrayList<String>());
        student3 = new Student(3, "11/17/2019 4:19", "CS", "Southeastern", "video games", new ArrayList<String>());
        list.add(student1);
        list.add(student2);
    }
    
    public void testGetSize()
    {
        assertEquals(0, list2.getSize());
        assertEquals(2, list.getSize());
    }
    
    public void testIsEmpty()
    {
        assertTrue(list2.isEmpty());
        assertFalse(list.isEmpty());
    }
    
    public void testClear()
    {
        assertFalse(list.isEmpty());
        list.clear();
        assertTrue(list.isEmpty());
    }
    
    public void testAdd()
    {
        assertEquals(2, list.getSize());
        list.add(student3);
        assertEquals(3, list.getSize());
        list2.add(student3);
        assertEquals(1, list2.getSize());
    }
    
    public void testRemove()
    {
        list2.remove();
        assertTrue(list2.isEmpty());
        assertEquals(2, list.getSize());
        list.remove();
        assertEquals(1, list.getSize());
        list.remove();
        assertTrue(list.isEmpty());
    }
    
    public void testGet()
    {
        assertNull(list2.get(1));
        assertEquals(student2, list.get(1));
        assertEquals(student1, list.get(2));
        list.add(student3);
        assertEquals(student3, list.get(1));
    }
    
    public void testToString()
    {
        assertEquals("[]", list2.toString());
        assertEquals("[Student 2 submitted on: 11/17/2019 "
            + "4:19 and is a CS major from Southeastern "
            + "region and whos hobby is video games, Student 1 "
            + "submitted on: 11/17/2019 4:19 and is a CS major from "
            + "Southeastern region and whos hobby is video games]", 
            list.toString());
    }
    
    public void testAdd2()
    {
        list.add(null);
        
        assertEquals(2, list.getSize());
    }
}
