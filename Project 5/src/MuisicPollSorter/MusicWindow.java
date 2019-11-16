package MuisicPollSorter;
import java.awt.Color;
import java.util.ArrayList;
import CS2114.Button;
import CS2114.Window;
import CS2114.CircleShape;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.WindowSide;

public class MusicWindow {

    private Window window;
    private Button previous;
    private Button next;
    private Button sortArtistName;
    private Button sortSongTitle;
    private Button sortReleaseYear;
    private Button sortGenre;
    
    public MusicWindow()
    {
        window = new Window();
        previous = new Button("<- Prev");
        next = new Button("Next ->");
        window.addButton(previous, WindowSide.NORTH);
        window.addButton(next, WindowSide.NORTH);
    }
}
