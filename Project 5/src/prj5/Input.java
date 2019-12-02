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

import java.io.FileNotFoundException;

/**
 * 
 * The input class contains the main method that
 * creates a new musicReader based on either its parameters or
 * the pre set files
 * 
 * @author Allison Woods (awoods99)
 * @author Samantha Khan (ksamantha18)
 * @author Luke Hall (lukehall033)
 * @version 11/18/2019
 */
public class Input {

    /*
     * The main method, that creates a new MusicReader
     */
    public static void main(String[] args) throws FileNotFoundException {

        // @SuppressWarnings("unused")
        if (args.length == 2) {
            @SuppressWarnings("unused")
            MusicReader reader = new MusicReader(args[1], args[0]);
        }
        else {
            @SuppressWarnings("unused")
            MusicReader reader = new MusicReader("SongList2019F.csv",
                "MusicSurveyData2019F.csv");
        }
    }

}
