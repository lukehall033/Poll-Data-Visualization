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

import student.TestCase;

/**
<<<<<<< HEAD
 * 
 * test class for the LinkedList class
 * 
 * @author Luke Hall (lukehall033)
 * @author Samantha Khan (ksamantha18)
 * @author Allison Woods (awoods99)
 * @version 11/28/2019
=======
 * f
 * 
 * @author lukeh
 * @version 11.28.2019
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
 */
public class LinkedListTest extends TestCase {

    /**
     * a test list of students
     */
    private LinkedList<Student> list;
    /**
     * a second test list of students
     */
    private LinkedList<Student> list2;
    /**
     * the first test student
     */
    private Student student1;
    /**
     * the second test student
     */
    private Student student2;
    /**
     * the third test student
     */
    private Student student3;


    /**
     * the setUp method, that runs before each test method
     */
    public void setUp() {
        list = new LinkedList<Student>();
        list2 = new LinkedList<Student>();
        list.add(student1);
        list.add(student2);
    }


    /**
     * tests getSize()
     */
    public void testGetSize() {
        assertEquals(0, list2.getSize());
        assertEquals(2, list.getSize());
    }


    /**
     * tests isEmpty()
     */
    public void testIsEmpty() {
        assertTrue(list2.isEmpty());
        assertFalse(list.isEmpty());
    }


    /**
     * test clear()
     */
    public void testClear() {
        assertFalse(list.isEmpty());
        list.clear();
        assertTrue(list.isEmpty());
    }


    /**
     * tests add()
     */
    public void testAdd() {
        assertEquals(2, list.getSize());
        list.add(student3);
        assertEquals(3, list.getSize());
        list2.add(student3);
        assertEquals(1, list2.getSize());
    }


    /**
     * tests remove()
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
     * tests get()
     */
    public void testGet() {
        assertNull(list2.get(1));
        assertEquals(student2, list.get(1));
        assertEquals(student1, list.get(2));
        list.add(student3);
        assertEquals(student3, list.get(1));
    }


    /**
     * tests toString()
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
     * tests add() again
     */
    public void testAdd2() {
        list.add(null);

        assertEquals(2, list.getSize());
    }
}
