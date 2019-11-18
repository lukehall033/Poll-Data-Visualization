package prj5;

public class Input {

    //temporary
    public static void main(String[] args) throws Exception {
        
        //@SuppressWarnings("unused")
        //MusicReader reader = new MusicReader("SongList2019F.csv", "MusicSurveyData2019F.csv");    
        MusicReader reader = new MusicReader(args[1], args[0]);
        //MusicReader reader = new MusicReader("SongList2018Intro.csv", "MusicSurveyData2018Intro.csv");
    }

}
