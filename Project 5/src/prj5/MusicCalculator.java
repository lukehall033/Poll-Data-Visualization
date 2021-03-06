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

import java.util.Arrays;

/**
 * The MusicCalculator class, which handles sorting the
 * array of songs, as well as going through each students
 * responses and calculating percentage values for each song
 * 
 * @author Luke Hall (lukehall033)
 * @author Samantha Khan (ksamantha18)
 * @author Allison Woods (awoods99)
 * @version 11/18/2019
 */
public class MusicCalculator {

    /**
     * the list of students passed from the parameters
     */
    private LinkedList<Student> studentList;
    /**
     * the list of songs that will be sorted
     */
    private Song[] songList;
    /**
     * a permanent list of songs, used to compare the position of
     * a song in the list to where it is in the survey data
     */
    private Song[] permList;


    /**
     * 
     * MusicCalculator constructor, that takes a list of students
     * and songs as parmeters
     * 
     * @param students
     *            linkedlist
     * @param songs
     *            songs
     */
    public MusicCalculator(LinkedList<Student> students, Song[] songs) {
        studentList = students;
        songList = songs;
        permList = new Song[songList.length];
        for (int i = 0; i < songList.length; i++) {
            permList[i] = songList[i];
        }
    }


    /**
     * 
     * A getter method to return the list of student objects
     * 
     * @return LinkedList<Student> students
     */
    public LinkedList<Student> getStudents() {
        return studentList;
    }


    /**
     * 
     * A getter method to return the array of songs
     * 
     * @return Song[] songs
     */
    public Song[] getSongs() {
        return songList;
    }


    /**
     * 
     * A method that gets the index of the song
     * in the original unsorted list
     * 
     * @param song
     *            song
     * @return int index
     */
    public int getIndexOf(Song song) {
        for (int i = 0; i < songList.length; i++) {
            if (permList[i] == song) {
                return i;
            }
        }
        return 0;
    }


    /**
     * sorts songList according to the songs artist name
     */
    public void sortedByArtistName() {
        Arrays.sort(songList, Song.compareByArtistName);
    }


    /**
     * sorts songList according to the songs release year
     */
    public void sortedByReleaseYear() {
        Arrays.sort(songList, Song.compareByYear);
    }


    /**
     * sorts songList according to the songs genre
     */
    public void sortedByGenre() {
        Arrays.sort(songList, Song.compareByGenre);
    }


    /**
     * sorts songlist according to the songs title
     */
    public void sortedByTitle() {
        Arrays.sort(songList, Song.compareByTitle);
    }


    /**
     * 
     * this method calculates the percentage of students that
     * liked and heard the song that passed as a paremeter based on
     * their hobbies. It returns these 8 values as an array of integers
     * 
     * @param song
     *            song
     * @return int[] values
     */
    public int[] calcForHobby(Song song) {
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
        int songIndex = getIndexOf(song) * 2;
        for (int j = 0; j < studentList.getSize(); j++) {
            if (studentList.get(j + 1).getHobby().equals("reading")) {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalReading++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex).equals(
                    "Yes")) {
                    heardReading++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex + 1)
                        .equals("Yes")) {
                        likedReading++;
                    }
                }
            }
            else if (studentList.get(j + 1).getHobby().equals("art")) {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalArt++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex).equals(
                    "Yes")) {
                    heardArt++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex + 1)
                        .equals("Yes")) {
                        likedArt++;
                    }
                }
            }
            else if (studentList.get(j + 1).getHobby().equals("sports")) {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalSports++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex).equals(
                    "Yes")) {
                    heardSports++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex + 1)
                        .equals("Yes")) {
                        likedSports++;
                    }
                }
            }
            else {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalMusic++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex).equals(
                    "Yes")) {
                    heardMusic++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex + 1)
                        .equals("Yes")) {
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
        int[] vals = new int[8];
        vals[0] = (int)(heardReading / totalReading * 100);
        vals[1] = (int)(likedReading / totalReading * 100);
        vals[2] = (int)(heardArt / totalArt * 100);
        vals[3] = (int)(likedArt / totalArt * 100);
        vals[4] = (int)(heardSports / totalSports * 100);
        vals[5] = (int)(likedSports / totalSports * 100);
        vals[6] = (int)(heardMusic / totalMusic * 100);
        vals[7] = (int)(likedMusic / totalMusic * 100);
        return vals;
    }


    /**
     * 
     * this method calculates the percentage of students that
     * liked and heard the song that passed as a paremeter based on
     * their major. It returns these 8 values as an array of integers
     * 
     * @param song
     *            song
     * @return int[] values
     */
    public int[] calcForMajor(Song song) {
        double totalCompSci = 0;
        double totalEng = 0;
        double totalMathCMDA = 0;
        double totalOther = 0;
        double heardCompSci = 0;
        double heardEng = 0;
        double heardMathCMDA = 0;
        double heardOther = 0;
        double likedCompSci = 0;
        double likedEng = 0;
        double likedMathCMDA = 0;
        double likedOther = 0;
        int songIndex = getIndexOf(song) * 2;
        for (int j = 0; j < studentList.getSize(); j++) {
            if (studentList.get(j + 1).getMajor().equals("Computer Science")) {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalCompSci++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex).equals(
                    "Yes")) {
                    heardCompSci++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex + 1)
                        .equals("Yes")) {
                        likedCompSci++;
                    }
                }
            }
            else if (studentList.get(j + 1).getMajor().equals(
                "Other Engineering")) {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalEng++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex).equals(
                    "Yes")) {
                    heardEng++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex + 1)
                        .equals("Yes")) {
                        likedEng++;
                    }
                }
            }
            else if (studentList.get(j + 1).getMajor().equals("Math or CMDA")) {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalMathCMDA++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex).equals(
                    "Yes")) {
                    heardMathCMDA++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex + 1)
                        .equals("Yes")) {
                        likedMathCMDA++;
                    }
                }
            }
            else {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalOther++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex).equals(
                    "Yes")) {
                    heardOther++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex + 1)
                        .equals("Yes")) {
                        likedOther++;
                    }
                }
            }
        }
        if (totalCompSci == 0) {
            totalCompSci = 1;
        }
        if (totalEng == 0) {
            totalEng = 1;
        }
        if (totalMathCMDA == 0) {
            totalMathCMDA = 1;
        }
        if (totalOther == 0) {
            totalOther = 1;
        }
        int[] vals = new int[8];
        vals[0] = (int)(heardCompSci / totalCompSci * 100);
        vals[1] = (int)(likedCompSci / totalCompSci * 100);
        vals[2] = (int)(heardEng / totalEng * 100);
        vals[3] = (int)(likedEng / totalEng * 100);
        vals[4] = (int)(heardMathCMDA / totalMathCMDA * 100);
        vals[5] = (int)(likedMathCMDA / totalMathCMDA * 100);
        vals[6] = (int)(heardOther / totalOther * 100);
        vals[7] = (int)(likedOther / totalOther * 100);
        return vals;
    }


    /**
     * 
     * this method calculates the percentage of students that
     * liked and heard the song that passed as a paremeter based on
     * their region. It returns these 8 values as an array of integers
     * 
     * @param song
     *            song
     * @return int[] values
     */
    public int[] calcForRegion(Song song) {
        double totalNortheast = 0;
        double totalSoutheast = 0;
        double totalRest = 0;
        double totalOutside = 0;
        double heardNortheast = 0;
        double heardSoutheast = 0;
        double heardRest = 0;
        double heardOutside = 0;
        double likedNortheast = 0;
        double likedSoutheast = 0;
        double likedRest = 0;
        double likedOutside = 0;
        int songIndex = getIndexOf(song) * 2;
        for (int j = 0; j < studentList.getSize(); j++) {
            if (studentList.get(j + 1).getRegion().equals("Northeast")) {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalNortheast++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex).equals(
                    "Yes")) {
                    heardNortheast++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex + 1)
                        .equals("Yes")) {
                        likedNortheast++;
                    }
                }
            }
            else if (studentList.get(j + 1).getRegion().equals("Southeast")) {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalSoutheast++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex).equals(
                    "Yes")) {
                    heardSoutheast++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex + 1)
                        .equals("Yes")) {
                        likedSoutheast++;
                    }
                }
            }
            else if (studentList.get(j + 1).getRegion().equals(
                "United States (other than Southeast or Northwest)")) {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalRest++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex).equals(
                    "Yes")) {
                    heardRest++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex + 1)
                        .equals("Yes")) {
                        likedRest++;
                    }
                }
            }
            else {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalOutside++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex).equals(
                    "Yes")) {
                    heardOutside++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex + 1)
                        .equals("Yes")) {
                        likedOutside++;
                    }
                }
            }
        }
        if (totalNortheast == 0) {
            totalNortheast = 1;
        }
        if (totalSoutheast == 0) {
            totalSoutheast = 1;
        }
        if (totalRest == 0) {
            totalRest = 1;
        }
        if (totalOutside == 0) {
            totalOutside = 1;
        }
        int[] vals = new int[8];
        vals[0] = (int)(heardNortheast / totalNortheast * 100);
        vals[1] = (int)(likedNortheast / totalNortheast * 100);
        vals[2] = (int)(heardSoutheast / totalSoutheast * 100);
        vals[3] = (int)(likedSoutheast / totalSoutheast * 100);
        vals[4] = (int)(heardRest / totalRest * 100);
        vals[5] = (int)(likedRest / totalRest * 100);
        vals[6] = (int)(heardOutside / totalOutside * 100);
        vals[7] = (int)(likedOutside / totalOutside * 100);
        return vals;
    }

}
