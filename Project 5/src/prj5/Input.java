package prj5;

/**
 * 
 * @author lukeh
 * @version 11.18.2019
 */
public class Input {

    /*
     * main
     */
    public static void main(String[] args) throws Exception {

        // @SuppressWarnings("unused")
        // MusicReader reader = new MusicReader("SongList2019F.csv"
        // , "MusicSurveyData2019F.csv");
        MusicReader reader = new MusicReader(args[1], args[0]);
        // MusicReader reader = new MusicReader("SongList2018HalfSongs.
        // csv", "MusicSurveyData2018HolesHalf.csv");
    }

}
