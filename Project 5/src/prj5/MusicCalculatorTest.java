/**
 * 
 */
package prj5;

import java.util.ArrayList;
import student.TestCase;

/**
 * @author samkahn1
 * @version 11.18.2019
 */
public class MusicCalculatorTest extends TestCase {
    /**
     * f
     */
    private MusicCalculator mc;
    /**
     * f
     */
    private LinkedList<Student> students;
    /**
     * f
     */
    private Song[] songs;
// private Student stud1;
// private Student stud2;
// private Song song1;
// private Song song2;
// private Song song3;
// private Student stud3;
// private ArrayList<String> responses;


    /**
     * f
     */
    public void setUp() {
        songs = new Song[3];
        students = new LinkedList<Student>();
        ArrayList<String> responses = new ArrayList<String>();
        responses.add("Yes");
        responses.add("No");
        responses.add("Yes");
        responses.add("Yes");
        mc = new MusicCalculator(students, songs);

        Student stud1 = new Student(12, "12/10/19", "CS", "Southeast",
            "reading", responses);

        Student stud2 = new Student(13, "12/11/19", "Math CMDA", "Southeast",
            "reading", responses);

        Student stud3 = new Student(13, "12/12/19", "CS", "Northeast",
            "reading", responses);

        students.add(stud1);
        students.add(stud2);
        students.add(stud3);

        Song song1 = new Song("Hello", "Adele", 1980, "rock");
        Song song2 = new Song("Baby", "JB", 1980, "pop");
        Song song3 = new Song("Liar", "Adele", 1972, "rock");

        songs[0] = song1;
        songs[1] = song2;
        songs[2] = song3;

    }


    /**
     * f
     */
    public void testGetSongs() {
        assertEquals(songs, mc.getSongs());
    }


    /**
     * f
     */
    public void testGetStudents() {
        assertEquals(students, mc.getStudents());
    }
}
