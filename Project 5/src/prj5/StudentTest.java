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

import java.util.ArrayList;
import student.TestCase;

/**
 * 
 * Test class for the student class
 * 
 * @auther Samantha Khan (ksamantha18)
 * @author Luke Hall (lukeh)
 * @author Allison Woods (awoods99)
 * @version 11/15/2019
 */
public class StudentTest extends TestCase {

    /**
     * a test student field
     */
    private Student student;
    /**
     * a test list of responses
     */
    private ArrayList<String> list = new ArrayList<String>();


    /**
     * Sets up before each test method.
     */
    public void setUp() {
        student = new Student(100, "11/11/2019 1:26", "CS", "Southeastern",
            "video games", list);
    }


    /**
     * tests getID()
     */
    public void testGetID() {
        assertEquals(100, student.getID());
    }


    /**
     * tests getDate()
     */
    public void testGetDate() {
        assertEquals("11/11/2019 1:26", student.getDate());
    }


    /**
     * tests getMajor()
     */
    public void testGetMajor() {
        assertEquals("CS", student.getMajor());
    }


    /**
     * tests getRegion()
     */
    public void testGetRegion() {
        assertEquals("Southeastern", student.getRegion());
    }


    /**
     * tests getHobby()
     */
    public void testGetHobby() {
        assertEquals("video games", student.getHobby());
    }


    /**
     * tests getResponses()
     */
    public void testGetResponses() {
        assertEquals(list, student.getResponses());
    }


    /**
     * tests toString();
     */
    public void testToString() {
        assertEquals("Student 100 submitted on: 11/11/2019 "
            + "1:26 and is a CS major from Southeastern "
            + "region and whos hobby is video games", student.toString());
    }


    /**
     * tests equals()
     */
    public void testEquals() {
        Object obj = new Object();
        assertFalse(student.equals(obj));
        obj = null;
        assertFalse(student.equals(obj));
        assertTrue(student.equals(student));
        Student student2 = new Student(200, "11/11/2019 1:26", "CS",
            "Southeastern", "video games", list);
        Student student3 = new Student(100, "11/12/2019 1:26", "CS",
            "Southeastern", "video games", list);
        Student student4 = new Student(100, "11/11/2019 1:26", "Math",
            "Southeastern", "video games", list);
        Student student5 = new Student(100, "11/11/2019 1:26", "CS", "North",
            "video games", list);
        Student student6 = new Student(100, "11/11/2019 1:26", "CS",
            "Southeastern", "sports", list);
        assertFalse(student.equals(student2));
        assertFalse(student.equals(student3));
        assertFalse(student.equals(student4));
        assertFalse(student.equals(student5));
        assertFalse(student.equals(student6));
    }
}