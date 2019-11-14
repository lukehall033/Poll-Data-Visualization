package MuisicPollSorter;
import student.TestCase;

public class SongTest extends TestCase {

    private Song song;
    
    public void setUp()
    {
        song = new Song("Call Me", "Blondie", 1980, "dance rock");
    }
    
    public void testGetName()
    {
        assertEquals("Call Me", song.getName());
    }
    
    public void testGetArtist()
    {
        assertEquals("Blondie", song.getArtist());
    }
    
    public void testGetYear()
    {
        assertEquals(1980, song.getYear());
    }
    
    public void testGetGenre()
    {
        assertEquals("dance rock", song.getGenre());
    }
    
    public void testToString()
    {
        assertEquals("Call Me by: Blondie, released: 1980 in genre dance rock", song.toString());
    }
    
    public void testEquals()
    {
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
    
    public void testEquals2()
    {
        //this is a test 
    }
    
   
}
