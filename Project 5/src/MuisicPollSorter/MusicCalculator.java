package MuisicPollSorter;

import java.util.Arrays;

public class MusicCalculator {

    private LinkedList<Student> studentList;
    private Song[] songList;
    
    public MusicCalculator(LinkedList<Student> students, Song[] songs)
    {
        studentList = students;
        songList = songs;
    }
    
    public LinkedList<Student> getStudents()
    {
        return studentList;
    }
    
    public Song[] getSongs()
    {
        return songList;
    }
    
    public void hobbySortedByGenre() //these are the two things we have to print out to pass the tests
    {              
        Song[] sortedSongList = songList; 
        Arrays.sort(sortedSongList);
        System.out.println(Arrays.toString(sortedSongList));
    }
    
    public void hobbySortedByTitle()
    {
        
    }
}
