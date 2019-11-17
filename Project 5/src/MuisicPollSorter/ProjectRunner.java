package MuisicPollSorter;

public class ProjectRunner {

    //temporary
    public static void main(String[] args) throws Exception {
        
        //MusicWindow window = new MusicWindow(); commenting this off for a bit to test musicReader
        MusicReader reader = new MusicReader("SongList2019F.csv", "MusicSurveyData2019.csv");
        reader.tempMethod();
    }

}
