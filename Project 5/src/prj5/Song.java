/**
 * Virginia Tech Honor Code Pledge:
 *
 * As a Hokie, I will conduct myself with honor
 * and integrity at all times.
 * I will not lie, cheat, or steal, nor will I
 * accept the actions of those who do.
 * -- Allison Woods (awoods99)
 * --
 * --
 */
package prj5;

import java.util.Comparator;

/**
 * 
 * a class that creates a Song object, which stores
 * song data from the survey data
 * 
 * @author Luke Hall (lukeh)
 * @author Allison Woods (awoods99)
 * @version 11/15/2019
 */
public class Song {

    /**
     * the name of the song
     */
    private String name;
    /**
     * the artist of the song
     */
    private String artist;
    /**
     * the year the song was released
     */
    private int year;
    /**
     * the genre of the song
     */
    private String genre;


    /**
     * 
     * the constructor for song
     * 
     * @param songName
     *            song
     * @param songArtist
     *            artist
     * @param songYear
     *            year
     * @param songGenre
     *            genre
     */
    public Song(
        String songName,
        String songArtist,
        int songYear,
        String songGenre) {
        name = songName;
        artist = songArtist;
        year = songYear;
        genre = songGenre;
    }


    /**
     * 
     * gets the songs name
     * 
     * @return String name
     */
    public String getName() {
        return this.name;
    }


    /**
     * 
     * gets the song artists name
     * 
     * @return String artist
     */
    public String getArtist() {
        return this.artist;
    }


    /**
     * 
     * gets the songs release year
     * 
     * @return int year
     */
    public int getYear() {
        return this.year;
    }


    /**
     * 
     * gets the genre of the song
     * 
     * @return String genre
     */
    public String getGenre() {
        return this.genre;
    }


    /**
     * 
     * returns the song in a string representation
     * 
     * @return String toString
     */
    public String toString() {
        return (getName() + " by: " + getArtist() + ", released: " + getYear()
            + " in genre " + getGenre());
    }


    /**
     * 
     * compres two songs for equality
     * 
     * @param obj
     *            obj
     * @return boolean bool
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (this.getClass() == obj.getClass()) {
            Song song = (Song)obj;
            return (this.getName().equals(song.getName()) && this.getArtist()
                .equals(song.getArtist()) && this.getYear() == song.getYear()
                && this.getGenre().equals(song.getGenre()));
        }
        else {
            return false;
        }
    }

<<<<<<< HEAD

    @Override
=======
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
    /**
     * compares two songs based on artist name
     */
<<<<<<< HEAD
    public int compareTo(Song s) {
        return (this.getGenre().compareTo(s.getGenre()));
    }
=======
    public static Comparator<Song> compareByArtistName =
        new Comparator<Song>() {
            public int compare(Song s, Song s2) {
                return (s.getArtist().compareTo(s2.getArtist()));
            }
        };
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git

    /**
     * compares two songs based on title
     */
<<<<<<< HEAD
<<<<<<< HEAD
    public static Comparator<Song> CompareByTitle = new Comparator<Song>() {
        public int compare(Song s, Song s2) {
=======
    public static Comparator<Song> compareByTitle = new Comparator<Song>()
    {
        public int compare(Song s, Song s2)
        {
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
=======
    public static Comparator<Song> compareByTitle = new Comparator<Song>() {
        public int compare(Song s, Song s2) {
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
            return (s.getName().compareTo(s2.getName()));
        }
    };

    /**
     * compares two songs based on year
     */
    public static Comparator<Song> compareByYear = new Comparator<Song>() {
        public int compare(Song s, Song s2) {
            return (s.getYear() - (s2.getYear()));
        }
    };

    /**
     * compares two songs based on genre
     */
    public static Comparator<Song> compareByGenre = new Comparator<Song>() {
        public int compare(Song s, Song s2) {
            return (s.getGenre().compareTo(s2.getGenre()));
        }
    };

}
