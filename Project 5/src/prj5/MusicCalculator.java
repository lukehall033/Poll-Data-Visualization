package prj5;

import java.util.Arrays;

/**
 * f
 * 
 * @author lukeh
 * @version 11.18.2019
 */
public class MusicCalculator {

    /**
     * f
     */
    private LinkedList<Student> studentList;
    /**
     * f
     */
    private Song[] songList;


    /**
     * f
     * 
     * @param students
     *            linkedlist
     * @param songs
     *            songs
     */
    public MusicCalculator(LinkedList<Student> students, Song[] songs) {
        studentList = students;
        songList = songs;
    }


    /**
     * f
     * 
     * @return LinkedList<Student> students
     */
    public LinkedList<Student> getStudents() {
        return studentList;
    }


    /**
     * f
     * 
     * @return Song[] songs
     */
    public Song[] getSongs() {
        return songList;
    }


    /**
     * f
     */
    public void hobbySortedByGenre() {
        // Song[] sortedSongList = songList;
        Song[] sortedSongList = new Song[songList.length];
        for (int f = 0; f < songList.length; f++) {
            sortedSongList[f] = songList[f];
        }
        Arrays.sort(sortedSongList);
        for (int i = 0; i < sortedSongList.length; i++) {
            double totalReading = 0;
            double totalArt = 0;
            double totalSports = 0;
            double totalMusic = 0;
            double heardReading = 0;
            double heardArt = 0;
            double heardSports = 0;
            double heardMusic = 0;
            double likedReading = 0;
            double likedArt = 0;
            double likedSports = 0;
            double likedMusic = 0;
            int songIndex;
            int temp = 0;
            for (int k = 0; k < songList.length; k++) {
                if (songList[k].getName().equals(sortedSongList[i].getName())) {
                    temp = k;
                }
            }
            songIndex = temp * 2;
            for (int j = 0; j < studentList.getSize(); j++) {
                if (studentList.get(j + 1).getHobby().equals("reading")) {
                    if (!studentList.get(j + 1).getResponses().get(songIndex)
                        .equals(" ")) {
                        totalReading++;
                    }
                    if (studentList.get(j + 1).getResponses().get(songIndex)
                        .equals("Yes")) {
                        heardReading++;
                    }
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                        .size() - 1))) {
                        if (studentList.get(j + 1).getResponses().get(songIndex
                            + 1).equals("Yes")) {
                            likedReading++;
                        }
                    }
                }
                else if (studentList.get(j + 1).getHobby().equals("art")) {
                    if (!studentList.get(j + 1).getResponses().get(songIndex)
                        .equals(" ")) {
                        totalArt++;
                    }
                    if (studentList.get(j + 1).getResponses().get(songIndex)
                        .equals("Yes")) {
                        heardArt++;
                    }
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                        .size() - 1))) {
                        if (studentList.get(j + 1).getResponses().get(songIndex
                            + 1).equals("Yes")) {
                            likedArt++;
                        }
                    }
                }
                else if (studentList.get(j + 1).getHobby().equals("sports")) {
                    if (!studentList.get(j + 1).getResponses().get(songIndex)
                        .equals(" ")) {
                        totalSports++;
                    }
                    if (studentList.get(j + 1).getResponses().get(songIndex)
                        .equals("Yes")) {
                        heardSports++;
                    }
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                        .size() - 1))) {
                        if (studentList.get(j + 1).getResponses().get(songIndex
                            + 1).equals("Yes")) {
                            likedSports++;
                        }
                    }
                }
                else {
                    if (!studentList.get(j + 1).getResponses().get(songIndex)
                        .equals(" ")) {
                        totalMusic++;
                    }
                    if (studentList.get(j + 1).getResponses().get(songIndex)
                        .equals("Yes")) {
                        heardMusic++;
                    }
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                        .size() - 1))) {
                        if (studentList.get(j + 1).getResponses().get(songIndex
                            + 1).equals("Yes")) {
                            likedMusic++;
                        }
                    }
                }
            }
            if (totalArt == 0) {
                totalArt = 1;
            }
            if (totalReading == 0) {
                totalReading = 1;
            }
            if (totalSports == 0) {
                totalSports = 1;
            }
            if (totalMusic == 0) {
                totalMusic = 1;
            }
            System.out.println("Song Title: " + sortedSongList[i].getName());
            System.out.println("Song Artist: " + sortedSongList[i].getArtist());
            System.out.println("Song Genre: " + sortedSongList[i].getGenre());
            System.out.println("Song Year: " + sortedSongList[i].getYear());
            System.out.println("Heard");
            System.out.println("reading:" + (int)(heardReading / totalReading
                * 100) + " art:" + (int)(heardArt / totalArt * 100) + " sports:"
                + (int)(heardSports / totalSports * 100) + " music:"
                + (int)(heardMusic / totalMusic * 100));
            System.out.println("Likes");
            System.out.println("reading:" + (int)(likedReading / totalReading
                * 100) + " art:" + (int)(likedArt / totalArt * 100) + " sports:"
                + (int)(likedSports / totalSports * 100) + " music:"
                + (int)(likedMusic / totalMusic * 100));
            System.out.println();
        }
    }


    /**
     * f
     */
    public void hobbySortedByTitle() {
        Song[] sortedSongList = new Song[songList.length];
        for (int f = 0; f < songList.length; f++) {
            sortedSongList[f] = songList[f];
        }
        Arrays.sort(sortedSongList, Song.compareByTitle);
        for (int i = 0; i < sortedSongList.length; i++) {
            double totalReading = 0;
            double totalArt = 0;
            double totalSports = 0;
            double totalMusic = 0;
            double heardReading = 0;
            double heardArt = 0;
            double heardSports = 0;
            double heardMusic = 0;
            double likedReading = 0;
            double likedArt = 0;
            double likedSports = 0;
            double likedMusic = 0;
            int songIndex;
            int temp = 0;
            for (int k = 0; k < songList.length; k++) {
                if (songList[k].getName().equals(sortedSongList[i].getName())) {
                    temp = k;
                }
            }
            songIndex = temp * 2;
            for (int j = 0; j < studentList.getSize(); j++) {
                if (studentList.get(j + 1).getHobby().equals("reading")) {
                    if (!studentList.get(j + 1).getResponses().get(songIndex)
                        .equals(" ")) {
                        totalReading++;
                    }
                    if (studentList.get(j + 1).getResponses().get(songIndex)
                        .equals("Yes")) {
                        heardReading++;
                    }
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                        .size() - 1))) {
                        if (studentList.get(j + 1).getResponses().get(songIndex
                            + 1).equals("Yes")) {
                            likedReading++;
                        }
                    }
                }
                else if (studentList.get(j + 1).getHobby().equals("art")) {
                    if (!studentList.get(j + 1).getResponses().get(songIndex)
                        .equals(" ")) {
                        totalArt++;
                    }
                    if (studentList.get(j + 1).getResponses().get(songIndex)
                        .equals("Yes")) {
                        heardArt++;
                    }
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                        .size() - 1))) {
                        if (studentList.get(j + 1).getResponses().get(songIndex
                            + 1).equals("Yes")) {
                            likedArt++;
                        }
                    }
                }
                else if (studentList.get(j + 1).getHobby().equals("sports")) {
                    if (!studentList.get(j + 1).getResponses().get(songIndex)
                        .equals(" ")) {
                        totalSports++;
                    }
                    if (studentList.get(j + 1).getResponses().get(songIndex)
                        .equals("Yes")) {
                        heardSports++;
                    }
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                        .size() - 1))) {
                        if (studentList.get(j + 1).getResponses().get(songIndex
                            + 1).equals("Yes")) {
                            likedSports++;
                        }
                    }
                }
                else {
                    if (!studentList.get(j + 1).getResponses().get(songIndex)
                        .equals(" ")) {
                        totalMusic++;
                    }
                    if (studentList.get(j + 1).getResponses().get(songIndex)
                        .equals("Yes")) {
                        heardMusic++;
                    }
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                        .size() - 1))) {
                        if (studentList.get(j + 1).getResponses().get(songIndex
                            + 1).equals("Yes")) {
                            likedMusic++;
                        }
                    }
                }
            }
            if (totalArt == 0) {
                totalArt = 1;
            }
            if (totalReading == 0) {
                totalReading = 1;
            }
            if (totalSports == 0) {
                totalSports = 1;
            }
            if (totalMusic == 0) {
                totalMusic = 1;
            }
            System.out.println("Song Title: " + sortedSongList[i].getName());
            System.out.println("Song Artist: " + sortedSongList[i].getArtist());
            System.out.println("Song Genre: " + sortedSongList[i].getGenre());
            System.out.println("Song Year: " + sortedSongList[i].getYear());
            System.out.println("Heard");
            System.out.println("reading:" + (int)(heardReading / totalReading
                * 100) + " art:" + (int)(heardArt / totalArt * 100) + " sports:"
                + (int)(heardSports / totalSports * 100) + " music:"
                + (int)(heardMusic / totalMusic * 100));
            System.out.println("Likes");
            System.out.println("reading:" + (int)(likedReading / totalReading
                * 100) + " art:" + (int)(likedArt / totalArt * 100) + " sports:"
                + (int)(likedSports / totalSports * 100) + " music:"
                + (int)(likedMusic / totalMusic * 100));
            System.out.println();
        }
    }
}
