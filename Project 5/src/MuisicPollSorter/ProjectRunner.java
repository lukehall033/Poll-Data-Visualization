package MuisicPollSorter;

public class ProjectRunner {

    //temporary
    public static void main(String[] args) throws Exception {
        
        //MusicWindow window = new MusicWindow();
        MusicReader reader = new MusicReader("SongList2019F.csv", "MusicSurveyData2019.csv");
        reader.tempMethod();
    }

}
