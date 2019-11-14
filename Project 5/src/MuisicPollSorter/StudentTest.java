package MuisicPollSorter;

import java.util.ArrayList;
import student.TestCase;

public class StudentTest extends TestCase {

    private Student student;
    private ArrayList<String> list = new ArrayList<String>();


    public void setUp() {
        student = new Student(100, "11/11/2019 1:26", "CS", "Southeastern",
            "video games", list);
    }


    public void testGetID() {
        assertEquals(100, student.getID());
    }


    public void testGetDate() {
        assertEquals("11/11/2019 1:26", student.getDate());
    }


    public void testGetMajor() {
        assertEquals("CS", student.getMajor());
    }


    public void testGetRegion() {
        assertEquals("Southeastern", student.getRegion());
    }


    public void testGetHobby() {
        assertEquals("video games", student.getHobby());
    }


    public void testGetResponses() {
        assertEquals(list, student.getResponses());
    }


    public void testToString() {
        assertEquals("Student 100 submitted on: 11/11/2019 "
            + "1:26 and is a CS major from Southeastern "
            + "region and whos hobby is video games", student.toString());
    }


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
