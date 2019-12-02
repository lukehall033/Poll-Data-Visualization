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
    private Song[] permList;


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
        permList = new Song[songList.length];
        for (int i = 0; i < songList.length; i++)
        {
            permList[i] = songList[i];
        }
    }


    /**
     * f
     * 
<<<<<<< HEAD
     * @return
=======
     * @return LinkedList<Student> students
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
     */
    public LinkedList<Student> getStudents() {
        return studentList;
    }


    /**
     * f
     * 
<<<<<<< HEAD
     * @return
=======
     * @return Song[] songs
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
     */
    public Song[] getSongs() {
        return songList;
    }
    
    public int getIndexOf(Song song)
    {
        for (int i = 0; i < songList.length; i++)
        {
            if (permList[i] == song)
            {
                return i;
            }
        }
        return 0;
    }

    public void sortedByArtistName()
    {
        Arrays.sort(songList, Song.compareByArtistName);
        //System.out.println(Arrays.toString(songList));
    }
    
    public void sortedByReleaseYear()
    {
        Arrays.sort(songList, Song.compareByYear);
        //System.out.println(Arrays.toString(songList));
    }

    /**
     * f
     */
<<<<<<< HEAD
<<<<<<< HEAD
    public void hobbySortedByGenre() // these are the two things we have to
                                     // print out to pass the tests
    {
=======
    public void hobbySortedByGenre() {
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
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
<<<<<<< HEAD
                    if (!(songIndex + 1 > (studentList.get(j + 1).getResponses()
=======
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
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
<<<<<<< HEAD
                    if (!(songIndex + 1 > (studentList.get(j + 1).getResponses()
=======
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
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
<<<<<<< HEAD
                    if (!(songIndex + 1 > (studentList.get(j + 1).getResponses()
=======
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
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
<<<<<<< HEAD
                    if (!(songIndex + 1 > (studentList.get(j + 1).getResponses()
=======
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
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
=======
    public void sortedByGenre() {
        Arrays.sort(songList, Song.compareByGenre);
        //System.out.println(Arrays.toString(songList));
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
    }


    /**
     * f
     */
<<<<<<< HEAD
    public void hobbySortedByTitle() {
        Song[] sortedSongList = new Song[songList.length];
        for (int f = 0; f < songList.length; f++) {
            sortedSongList[f] = songList[f];
        }
<<<<<<< HEAD
        Arrays.sort(sortedSongList, Song.CompareByTitle);
=======
        Arrays.sort(sortedSongList, Song.compareByTitle);
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
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
<<<<<<< HEAD
                    if (!(songIndex + 1 > (studentList.get(j + 1).getResponses()
=======
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
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
<<<<<<< HEAD
                    if (!(songIndex + 1 > (studentList.get(j + 1).getResponses()
=======
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
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
<<<<<<< HEAD
                    if (!(songIndex + 1 > (studentList.get(j + 1).getResponses()
=======
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
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
<<<<<<< HEAD
                    if (!(songIndex + 1 > (studentList.get(j + 1).getResponses()
=======
                    if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
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
=======
    public void sortedByTitle() {
        Arrays.sort(songList, Song.compareByTitle);
        //System.out.println(Arrays.toString(songList));       
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
    }
    
    public int[] calcForHobby(Song song)
    {
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
    
    public int[] calcForMajor(Song song)
    {
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
                if (studentList.get(j + 1).getResponses().get(songIndex)
                    .equals("Yes")) {
                    heardCompSci++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex
                        + 1).equals("Yes")) {
                        likedCompSci++;
                    }
                }
            }
            else if (studentList.get(j + 1).getMajor().equals("Other Engineering")) {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalEng++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex)
                    .equals("Yes")) {
                    heardEng++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex
                        + 1).equals("Yes")) {
                        likedEng++;
                    }
                }
            }
            else if (studentList.get(j + 1).getMajor().equals("Math or CMDA")) {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalMathCMDA++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex)
                    .equals("Yes")) {
                    heardMathCMDA++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex
                        + 1).equals("Yes")) {
                        likedMathCMDA++;
                    }
                }
            }
            else {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalOther++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex)
                    .equals("Yes")) {
                    heardOther++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex
                        + 1).equals("Yes")) {
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
    
    public int[] calcForRegion(Song song)
    {
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
                if (studentList.get(j + 1).getResponses().get(songIndex)
                    .equals("Yes")) {
                    heardNortheast++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex
                        + 1).equals("Yes")) {
                        likedNortheast++;
                    }
                }
            }
            else if (studentList.get(j + 1).getRegion().equals("Southeast")) {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalSoutheast++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex)
                    .equals("Yes")) {
                    heardSoutheast++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex
                        + 1).equals("Yes")) {
                        likedSoutheast++;
                    }
                }
            }
            else if (studentList.get(j + 1).getRegion().equals("United States (other than Southeast or Northwest)")) {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalRest++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex)
                    .equals("Yes")) {
                    heardRest++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex
                        + 1).equals("Yes")) {
                        likedRest++;
                    }
                }
            }
            else {
                if (!studentList.get(j + 1).getResponses().get(songIndex)
                    .equals(" ")) {
                    totalOutside++;
                }
                if (studentList.get(j + 1).getResponses().get(songIndex)
                    .equals("Yes")) {
                    heardOutside++;
                }
                if ((songIndex + 1 <= (studentList.get(j + 1).getResponses()
                    .size() - 1))) {
                    if (studentList.get(j + 1).getResponses().get(songIndex
                        + 1).equals("Yes")) {
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
