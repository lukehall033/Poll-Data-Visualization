package MuisicPollSorter;

public class MusicCalculator {

    private LinkedList<Student> studentList;
    private Song[] songList;
    
    public MusicCalculator(LinkedList<Student> students, Song[] songs)
    {
        studentList = students;
        songList = songs;
    }
}
