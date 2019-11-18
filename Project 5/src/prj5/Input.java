package prj5;

public class Input {

    //temporary
    public static void main(String[] args) throws Exception {
        
        //@SuppressWarnings("unused")
        //MusicReader reader = new MusicReader("SongList2019F.csv", "MusicSurveyData2019F.csv");    
        MusicReader reader = new MusicReader(args[0], args[1]);
    }

}
