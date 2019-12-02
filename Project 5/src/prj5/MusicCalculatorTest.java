package prj5;
import java.util.ArrayList;
import java.util.Arrays;
import student.TestCase;

public class MusicCalculatorTest extends TestCase{

    MusicCalculator calc;
    LinkedList<Student> students;
    Song[] songs;
    Song song1;
    Song song2;
    Song song3;
    
    public void setUp()
    {
        songs = new Song[3];
        students = new LinkedList<Student>();
<<<<<<< HEAD
        ArrayList<String> responses = new ArrayList<String>();
        responses.add("Yes");
        responses.add("No");
        responses.add("Yes");
        responses.add("Yes");
        mc = new MusicCalculator(students, songs);

<<<<<<< HEAD
        stud1 = new Student(12, "12/10/19", "CS", "Southeast", "reading",
            responses);

        stud2 = new Student(13, "12/11/19", "Math CMDA", "Southeast", "reading",
            responses);

        stud3 = new Student(13, "12/12/19", "CS", "Northeast", "reading",
            responses);
=======
        stud1 = new Student(12, "12/10/19", "CS", "Southeast",
            "reading", responses);

        stud2 = new Student(13, "12/11/19", "Math CMDA", "Southeast",
            "reading", responses);

        stud3 = new Student(13, "12/12/19", "CS", "Northeast",
            "reading", responses);
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git

        students.add(stud1);
        students.add(stud2);
<<<<<<< HEAD

        song1 = new Song("Hello", "Adele", 1980, "rock");
        song2 = new Song("Baby", "JB", 1980, "pop");
        song3 = new Song("Liar", "Adele", 1972, "rock");
=======
        
        students.add(stud3);

        
        Song song1 = new Song("Hello", "Adele", 1980, "rock");
        Song song2 = new Song("Baby", "JB", 1980, "pop");
        Song song3 = new Song("Liar", "Adele", 1972, "rock");
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git

=======
        song1 = new Song("Anarchy in the UK", "The Sex Pistols", 1, "Alternative");
        song2 = new Song("Bad Blood", "Taylor Swift", 2, "Pop");
        song3 = new Song("American Pie", "Done McLean", 3, "Rock");
        Student student1 = new Student(1, "1", "Computer Science", "Northeast", "reading", new ArrayList<String>(Arrays.asList("Yes", "No", "Yes", "Yes", "No", "No")));
        Student student2 = new Student(2, "2", "Math or CMDA", "Northeast", "art", new ArrayList<String>(Arrays.asList("No", "No", "Yes", "No", "Yes", "Yes")));
        Student student3 = new Student(3, "3", "Other", "Southeast", "music", new ArrayList<String>(Arrays.asList("No", "No", "No", "No", "No", "No")));
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
        songs[0] = song1;
        songs[1] = song2;
        songs[2] = song3;
<<<<<<< HEAD

<<<<<<< HEAD
    }


    public void testGetSongs() {
        assertEquals(songs, mc.getSongs());
    }


    public void testGetStudents() {
        assertEquals(students, mc.getStudents());
    }


    public void testHobbySortedByGenre() {
        mc.hobbySortedByGenre();
        assertEquals(song3, songs[1]);
=======
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
=======
        students.add(student1);
        students.add(student2);
        students.add(student3);
        calc = new MusicCalculator(students, songs);
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
    }
    
    public void testGetStudents()
    {
        assertEquals(students, calc.getStudents());
    }
    
    public void testGetSongs()
    {
        assertEquals(songs, calc.getSongs());
    }
    
    public void testGetIndexOf()
    {
        Song nullSong = new Song("", "", 0, "");
        assertEquals(0, calc.getIndexOf(song1));
        assertEquals(1, calc.getIndexOf(song2));
        assertEquals(2, calc.getIndexOf(song3));
        assertEquals(0, calc.getIndexOf(nullSong));
    }
    
    public void testSortedByArtistName()
    {
        assertEquals(song1, calc.getSongs()[0]);
        calc.sortedByArtistName();
        assertEquals(song3, calc.getSongs()[0]);
    }
    
    public void testSortedByReleaseYear()
    {
        assertEquals(song1, calc.getSongs()[0]);
        calc.sortedByReleaseYear();
        assertEquals(song1, calc.getSongs()[0]);
    }
    
    public void testSortedByGenre()
    {
        assertEquals(song1, calc.getSongs()[0]);
        calc.sortedByGenre();
        assertEquals(song1, calc.getSongs()[0]);
    }
    
    public void testSortedByTitle()
    {
        assertEquals(song1, calc.getSongs()[0]);
        calc.sortedByTitle();
        assertEquals(song3, calc.getSongs()[0]);
    }
    
    public void testCalcForHobby()
    {
        assertEquals(100, calc.calcForHobby(song1)[0]);
    }
    
    public void testCalcForMajor()
    {
        assertEquals(100, calc.calcForMajor(song2)[1]);
    }
    
    public void testCalcForRegion()
    {
        assertEquals(50, calc.calcForRegion(song3)[0]);
    }
    
    
}
