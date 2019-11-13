package MuisicPollSorter;

public class Song {

    private String name;
    private String artist;
    private int year;
    private String genre;
    
    public Song(String songName, String songArtist, int songYear, String songGenre)
    {
        name = songName;
        artist = songArtist;
        year = songYear;
        genre = songGenre;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public boolean returnTrue()
    {
        return true;
    }
    
    public String getArtist()
    {
        return this.artist;
    }
    
    public int getYear()
    {
        return this.year;
    }
    
    public String getGenre()
    {
        return this.genre;
    }
    
    public String toString()
    {
        return (getName() + " by: " + 
            getArtist() + ", released: " + getYear() + 
            " in genre " +  getGenre());
    }
    
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (obj == this)
        {
            return true;
        }
        if (this.getClass() == obj.getClass())
        {
            Song song = (Song)obj;
            return (this.getName().equals(song.getName()) 
                && this.getArtist().equals(song.getArtist()) && 
                this.getYear() == song.getYear() && 
                this.getGenre().equals(song.getGenre()));
        }
        else
        {
            return false;
        }
    }
    
}
