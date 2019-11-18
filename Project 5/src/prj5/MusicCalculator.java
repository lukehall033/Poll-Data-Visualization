package prj5;

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
        //Song[] sortedSongList = songList;
        Song[] sortedSongList = new Song[songList.length];
        for (int f = 0; f < songList.length; f++)
        {
            sortedSongList[f] = songList[f];
        }
        Arrays.sort(sortedSongList);
        for (int i = 0; i < sortedSongList.length; i++)
        {
            int totalReading = 0;
            int totalArt = 0;
            int totalSports = 0;
            int totalMusic = 0;
            int heardReading = 0;
            int heardArt = 0;
            int heardSports = 0;
            int heardMusic = 0;
            int likedReading = 0;
            int likedArt = 0;
            int likedSports = 0;
            int likedMusic = 0;
            int songIndex;
            int temp = 0;
            for (int k = 0; k < songList.length; k++)
            {
                if (songList[k].getName().equals(sortedSongList[i].getName()))
                {
                    temp = k;
                }
            }
            songIndex = temp * 2;
            for (int j = 0; j < studentList.getSize(); j++)
            {
                if (studentList.get(j + 1).getHobby().equals("reading"))
                {
                    totalReading++;
                    if (studentList.get(j + 1).getResponses().get(songIndex).equals("Yes"))
                    {
                        heardReading++;
                    }
                    if (!(songIndex + 1 > (studentList.get(j + 1).getResponses().size() - 1)))
                    {
                        if (studentList.get(j + 1).getResponses().get(songIndex + 1).equals("Yes"))
                        {
                            likedReading++;
                        }
                    }
                }
                else if (studentList.get(j + 1).getHobby().equals("art"))
                {
                    totalArt++;
                    if (studentList.get(j + 1).getResponses().get(songIndex).equals("Yes"))
                    {
                        heardArt++;
                    }
                    if (!(songIndex + 1 > (studentList.get(j + 1).getResponses().size() - 1)))
                    {
                        if (studentList.get(j + 1).getResponses().get(songIndex + 1).equals("Yes"))
                        {
                            likedArt++;
                        }
                    }
                }
                else if (studentList.get(j + 1).getHobby().equals("sports"))
                {
                    totalSports++;
                    if (studentList.get(j + 1).getResponses().get(songIndex).equals("Yes"))
                    {
                        heardSports++;
                    }
                    if (!(songIndex + 1 > (studentList.get(j + 1).getResponses().size() - 1)))
                    {
                        if (studentList.get(j + 1).getResponses().get(songIndex + 1).equals("Yes"))
                        {
                            likedSports++;
                        }
                    }
                }
                else
                {
                    totalMusic++;
                    if (studentList.get(j + 1).getResponses().get(songIndex).equals("Yes"))
                    {
                        heardMusic++;
                    }
                    if (!(songIndex + 1 > (studentList.get(j + 1).getResponses().size() - 1)))
                    {
                        if (studentList.get(j + 1).getResponses().get(songIndex + 1).equals("Yes"))
                        {
                            likedMusic++;
                        }
                    }
                }
            }
            if (totalArt == 0)
            {
                totalArt = 1;
            }
            if (totalReading == 0)
            {
                totalReading = 1;
            }
            if (totalSports == 0)
            {
                totalSports = 1;
            }
            if (totalMusic == 0)
            {
                totalMusic = 1;
            }
            System.out.println("Song Title: " + sortedSongList[i].getName());
            System.out.println("Song Artist: " + sortedSongList[i].getArtist());
            System.out.println("Song Genre: " + sortedSongList[i].getGenre());
            System.out.println("Song Year: " + sortedSongList[i].getYear());
            System.out.println("Heard");
            System.out.println("reading:" + heardReading/totalReading * 100 + " art:" + heardArt/totalArt * 100 + " sports:" + heardSports/totalSports * 100 + " music:" + heardMusic/totalMusic * 100);
            System.out.println("Likes");
            System.out.println("reading:" + likedReading/totalReading * 100 + " art:" + likedArt/totalArt * 100 + " sports:" + likedSports/totalSports * 100 + " music:" + likedMusic/totalMusic * 100);
            System.out.println();
        }
    }
    
    public void hobbySortedByTitle()
    {
        
    }
}
