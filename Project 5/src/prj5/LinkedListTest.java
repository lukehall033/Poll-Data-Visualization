package prj5;

import java.util.ArrayList;
import student.TestCase;

/**
 * f
 * 
 * @author lukeh
 * @version 11.28.2019
 */
public class LinkedListTest extends TestCase {

    /**
     * f
     */
    private LinkedList<Student> list;
    /**
     * f
     */
    private LinkedList<Student> list2;
    /**
     * f
     */
    private Student student1;
    /**
     * f
     */
    private Student student2;
    /**
     * f
     */
    private Student student3;


    /**
     * f
     */
    public void setUp() {
        list = new LinkedList<Student>();
        list2 = new LinkedList<Student>();
<<<<<<< HEAD
        student1 = new Student(1, "11/17/2019 4:19", "CS", "Southeastern",
            "video games", new ArrayList<String>());
        student2 = new Student(2, "11/17/2019 4:19", "CS", "Southeastern",
            "video games", new ArrayList<String>());
        student3 = new Student(3, "11/17/2019 4:19", "CS", "Southeastern",
            "video games", new ArrayList<String>());
=======
        student1 = new Student(1, "11/17/2019 4:19", 
            "CS", "Southeastern", "video games", 
            new ArrayList<String>());
        student2 = new Student(2, "11/17/2019 4:19", 
            "CS", "Southeastern", "video games", 
            new ArrayList<String>());
        student3 = new Student(3, "11/17/2019 4:19", 
            "CS", "Southeastern", "video games", 
            new ArrayList<String>());
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
        list.add(student1);
        list.add(student2);
    }


    /**
     * f
     */
    public void testGetSize() {
        assertEquals(0, list2.getSize());
        assertEquals(2, list.getSize());
    }


    /**
     * f
     */
    public void testIsEmpty() {
        assertTrue(list2.isEmpty());
        assertFalse(list.isEmpty());
    }


    /**
     * f
     */
    public void testClear() {
        assertFalse(list.isEmpty());
        list.clear();
        assertTrue(list.isEmpty());
    }


    /**
     * f
     */
    public void testAdd() {
        assertEquals(2, list.getSize());
        list.add(student3);
        assertEquals(3, list.getSize());
        list2.add(student3);
        assertEquals(1, list2.getSize());
    }


    /**
     * f
     */
    public void testRemove() {
        list2.remove();
        assertTrue(list2.isEmpty());
        assertEquals(2, list.getSize());
        list.remove();
        assertEquals(1, list.getSize());
        list.remove();
        assertTrue(list.isEmpty());
    }


    /**
     * f
     */
    public void testGet() {
        assertNull(list2.get(1));
        assertEquals(student2, list.get(1));
        assertEquals(student1, list.get(2));
        list.add(student3);
        assertEquals(student3, list.get(1));
    }


    /**
     * f
     */
    public void testToString() {
        assertEquals("[]", list2.toString());
        assertEquals("[Student 2 submitted on: 11/17/2019 "
            + "4:19 and is a CS major from Southeastern "
            + "region and whos hobby is video games, Student 1 "
            + "submitted on: 11/17/2019 4:19 and is a CS major from "
            + "Southeastern region and whos hobby is video games]", list
                .toString());
    }


    /**
     * f
     */
    public void testAdd2() {
        list.add(null);

        assertEquals(2, list.getSize());
    }
}
