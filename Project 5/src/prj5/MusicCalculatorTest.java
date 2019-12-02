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

import java.util.ArrayList;
import java.util.Arrays;
import student.TestCase;

/**
 * 
 * Test class for the music calculator class
 * 
 * @author Luke Hall (lukehall033)
 * @author Samantha Khan (ksamantha18)
 * @author Allison Woods (awoods99)
 * @version 12/2/19
 */
public class MusicCalculatorTest extends TestCase {

    /**
     * the test musicCalculator object
     */
    MusicCalculator calc;
    /**
     * the test list of students
     */
    LinkedList<Student> students;
    /**
     * the test array of songs
     */
    Song[] songs;
    /**
     * the first test song
     */
    Song song1;
    /**
     * the second test song
     */
    Song song2;
    /**
     * the third test song
     */
    Song song3;


    /**
     * the setUp method thats run before each test method
     */
    public void setUp() {
        songs = new Song[3];
        students = new LinkedList<Student>();
        song1 = new Song("Anarchy in the UK", "The Sex Pistols", 1,
            "Alternative");
        song2 = new Song("Bad Blood", "Taylor Swift", 2, "Pop");
        song3 = new Song("American Pie", "Done McLean", 3, "Rock");
        Student student1 = new Student(1, "1", "Computer Science", "Northeast",
            "reading", new ArrayList<String>(Arrays.asList("Yes", "No", "Yes",
                "Yes", "No", "")));
        Student student2 = new Student(2, "2", "Math or CMDA",
            "Outside of United States", "art", new ArrayList<String>(Arrays
                .asList("No", "No", "Yes", "", "Yes", "Yes")));
        Student student3 = new Student(3, "3", "Other", "Southeast", "music",
            new ArrayList<String>(Arrays.asList("No", "No", "No", "No", "",
                "No")));
        Student student4 = new Student(4, "4", "Other Engineering",
            "United States (other than Southeast or Northwest", "sports",
            new ArrayList<String>(Arrays.asList("No", "No", "Yes", "", "",
                "")));
        songs[0] = song1;
        songs[1] = song2;
        songs[2] = song3;
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        calc = new MusicCalculator(students, songs);
    }


    /**
     * tests getStudents()
     */
    public void testGetStudents() {
        assertEquals(students, calc.getStudents());
    }


    /**
     * tests getSongs()
     */
    public void testGetSongs() {
        assertEquals(songs, calc.getSongs());
    }


    /**
     * tests getIndexOf()
     */
    public void testGetIndexOf() {
        Song nullSong = new Song("", "", 0, "");
        assertEquals(0, calc.getIndexOf(song1));
        assertEquals(1, calc.getIndexOf(song2));
        assertEquals(2, calc.getIndexOf(song3));
        assertEquals(0, calc.getIndexOf(nullSong));
    }


    /**
     * tests sortedByArtistName()
     */
    public void testSortedByArtistName() {
        assertEquals(song1, calc.getSongs()[0]);
        calc.sortedByArtistName();
        assertEquals(song3, calc.getSongs()[0]);
    }


    /**
     * tests sortedByReleaseYear()
     */
    public void testSortedByReleaseYear() {
        assertEquals(song1, calc.getSongs()[0]);
        calc.sortedByReleaseYear();
        assertEquals(song1, calc.getSongs()[0]);
    }


    /**
     * tests sortedByGenre()
     */
    public void testSortedByGenre() {
        assertEquals(song1, calc.getSongs()[0]);
        calc.sortedByGenre();
        assertEquals(song1, calc.getSongs()[0]);
    }


    /**
     * tests sortedByTitle()
     */
    public void testSortedByTitle() {
        assertEquals(song1, calc.getSongs()[0]);
        calc.sortedByTitle();
        assertEquals(song3, calc.getSongs()[0]);
    }


    /**
     * tests calcForHobby()
     */
    public void testCalcForHobby() {
        assertEquals(100, calc.calcForHobby(song1)[0]);
        assertEquals(100, calc.calcForHobby(song2)[1]);
        assertEquals(0, calc.calcForHobby(song3)[5]);
    }


    /**
     * tests calcForMajor()
     */
    public void testCalcForMajor() {
        assertEquals(100, calc.calcForMajor(song2)[1]);
        assertEquals(0, calc.calcForMajor(song1)[1]);
        assertEquals(100, calc.calcForMajor(song3)[4]);
    }


    /**
     * tests calcForRegion()
     */
    public void testCalcForRegion() {
        assertEquals(0, calc.calcForRegion(song3)[0]);
        assertEquals(0, calc.calcForRegion(song1)[3]);
        assertEquals(100, calc.calcForRegion(song2)[6]);
    }

}
