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

import student.TestCase;

/**
 * 
 * 
 * @author
 * @author
 * @author Allison Woods (awoods99)
 * @version 11/15/2019
 */
public class SongTest extends TestCase {

    /**
     * f
     **/
    private Song song;


    /**
     * Sets up before each test method.
     */
    public void setUp() {
        song = new Song("Call Me", "Blondie", 1980, "dance rock");
    }


    /**
     * f
     */
    public void testGetName() {
        assertEquals("Call Me", song.getName());
    }


    /**
     * f
     */
    public void testGetArtist() {
        assertEquals("Blondie", song.getArtist());
    }


    /**
     * f
     */
    public void testGetYear() {
        assertEquals(1980, song.getYear());
    }


    /**
     * f
     */
    public void testGetGenre() {
        assertEquals("dance rock", song.getGenre());
    }


    /**
     * f
     */
    public void testToString() {
        assertEquals("Call Me by: Blondie, released: 1980 in genre dance rock",
            song.toString());
    }


    /**
     * f
     */
    public void testEquals() {
        Object obj = new Object();
        assertFalse(song.equals(obj));
        obj = null;
        assertFalse(song.equals(obj));
        assertTrue(song.equals(song));
        Song song2 = new Song("Not Call Me", "Blondie", 1980, "dance rock");
        Song song3 = new Song("Call Me", "Not Blondie", 1980, "dance rock");
        Song song4 = new Song("Call Me", "Blondie", 1900, "dance rock");
        Song song5 = new Song("Call Me", "Blondie", 1980, "not dance rock");
        assertFalse(song.equals(song2));
        assertFalse(song.equals(song3));
        assertFalse(song.equals(song4));
        assertFalse(song.equals(song5));
    }


    /**
     * f
     */
    public void testEquals2() {
        Song song6 = new Song("Not Call Me", "NotBlondie", 1990, "not dance");
        assertFalse(song.equals(song6));
    }


    /**
     * f
     */
    public void testCompareTo() {
        Song song6 = new Song("Not Call Me", "NotBlondie", 1990, "not dance");
        assertEquals(-10, song.compareTo(song6));
    }

}
