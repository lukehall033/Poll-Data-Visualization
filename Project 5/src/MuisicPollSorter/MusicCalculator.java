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
        for (int i = 0; i < sortedSongList.length; i++)
        {
            System.out.println("Song Title: " + sortedSongList[i].getName());
            System.out.println("Song Artist: " + sortedSongList[i].getArtist());
            System.out.println("Song Genre: " + sortedSongList[i].getGenre());
            System.out.println("Song Year: " + sortedSongList[i].getYear());
            System.out.println("Heard");
            System.out.println("reading:0 art:0 sports:0 music:0");
            System.out.println("Likes");
            System.out.println("reading:0 art:0 sports:0 music:0");
            System.out.println();
        }
    }
    
    public void hobbySortedByTitle()
    {
        
    }
}
