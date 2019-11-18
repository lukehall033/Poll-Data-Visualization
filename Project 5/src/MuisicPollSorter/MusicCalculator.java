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
            int heardReading = 0;
            int heardArt = 0;
            int heardSports = 0;
            int heardMusic = 0;
            int likedReading = 0;
            int likedArt = 0;
            int likedSports = 0;
            int likedMusic = 0;
            for (int j = 0; j < studentList.getSize(); j++)
            {
                if (studentList.get(j + 1).getHobby().equals("reading"))
                {
                    //not done yet, need to tally everything up, but its almost done
                }
                else if (studentList.get(j + 1).getHobby().equals("art"))
                {
                    //not done yet
                }
                else if (studentList.get(j + 1).getHobby().equals("sports"))
                {
                    //not done yet
                }
                else
                {
                    //not done yet
                }
            }
            System.out.println("Song Title: " + sortedSongList[i].getName());
            System.out.println("Song Artist: " + sortedSongList[i].getArtist());
            System.out.println("Song Genre: " + sortedSongList[i].getGenre());
            System.out.println("Song Year: " + sortedSongList[i].getYear());
            System.out.println("Heard");
            System.out.println("reading:" + heardReading + " art:" + heardArt + " sports:" + heardSports + " music:" + heardMusic);
            System.out.println("Likes");
            System.out.println("reading:" + likedReading + " art:" + likedArt + " sports:" + likedSports + " music:" + likedMusic);
            System.out.println();
        }
    }
    
    public void hobbySortedByTitle()
    {
        
    }
}
