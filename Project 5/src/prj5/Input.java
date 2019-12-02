package prj5;

import java.io.FileNotFoundException;

/**
 * 
 * @author lukeh
 * @version 11.18.2019
 */
public class Input {

    /*
     * main
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        //@SuppressWarnings("unused")
        //MusicReader reader = new MusicReader("SongList2019F.csv"
        //, "MusicSurveyData2019F.csv");    
        if(args.length == 2) {
            @SuppressWarnings("unused")
            MusicReader reader = new MusicReader(args[1], args[0]);
        }
        else {
            @SuppressWarnings("unused")
            MusicReader reader = new MusicReader("SongList2019F.csv", "MusicSurveyData2019F.csv");
        }
    }

}
