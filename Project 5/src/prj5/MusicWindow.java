package prj5;
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
    private Button representHobby;
    private Button representMajor;
    private Button representRegion;
    private Button quit;
    private Shape glyph;
    private Shape bar1;
    private Shape bar2;
    private Shape bar3;
    private Shape bar4;
    private TextShape songText;
    private TextShape songText2;
    private Shape legend1;
    private Shape legend2;
    private Shape legend3;
    private Shape legend4;
    private TextShape legendTitle;
    private TextShape option1;
    private TextShape option2;
    private TextShape option3;
    private TextShape option4;
    private TextShape exampleText;
    private TextShape exampleText2;
    private TextShape exampleText3;
    private Shape exampleShape;
    
    private MusicCalculator calculator;
    
    public MusicWindow(MusicCalculator calc)
    {
        calculator = calc;
        window = new Window();
        window.setTitle("Project 5");
        previous = new Button("<- Prev");
        next = new Button("Next ->");
        sortArtistName = new Button("Sort by Artist Name");
        sortSongTitle = new Button("Sort by Song Title");
        sortReleaseYear = new Button("Sort by Release Year");
        sortGenre = new Button("Sort by Genre");
        
        sortGenre.onClick(this, "clickedSortByGenre");
        tempMethod();
        
        representHobby = new Button("Represent Hobby");
        representMajor = new Button("Represent Major");
        representRegion = new Button("Represent Region");
        quit = new Button("Quit");
        glyph = new Shape(368, 120, 8, 48, Color.BLACK);
        bar1 = new Shape(322, 120, 100, 12, Color.MAGENTA);
        bar2 = new Shape(322, 132, 100, 12, Color.BLUE);
        bar3 = new Shape(322, 144, 100, 12, Color.YELLOW);
        bar4 = new Shape(322, 156, 100, 12, Color.GREEN);
        songText = new TextShape(290, 80, "Another One Bites The Dust");
        songText2 = new TextShape(335, 100, "by Queen");
        songText.setBackgroundColor(Color.WHITE);
        songText2.setBackgroundColor(Color.WHITE);
        legend1 = new Shape(720, 115, 2, 170, Color.BLACK);
        legend2 = new Shape(608, 115, 2, 170, Color.BLACK);
        legendTitle = new TextShape(615, 117, "Hobby Legend");
        option1 = new TextShape(615, 137, "Read", Color.MAGENTA);
        option2 = new TextShape(615, 157, "Art", Color.BLUE);
        option3 = new TextShape(615, 177, "Sports", new Color(237, 237, 78));
        option4 = new TextShape(615, 197, "Music", Color.GREEN);
        exampleText = new TextShape(630, 217, "Song Title");
        exampleShape = new Shape(663, 237, 8, 44, Color.BLACK);
        exampleText2 = new TextShape(619, 250, "Heard");
        exampleText3 = new TextShape(673, 250, "Likes");
        legendTitle.setBackgroundColor(Color.WHITE);
        option1.setBackgroundColor(Color.WHITE);
        option2.setBackgroundColor(Color.WHITE);
        option3.setBackgroundColor(Color.WHITE);
        option4.setBackgroundColor(Color.WHITE);
        exampleText.setBackgroundColor(Color.WHITE);
        exampleText2.setBackgroundColor(Color.WHITE);
        exampleText3.setBackgroundColor(Color.WHITE);
        legend3 = new Shape(608, 115, 114, 2, Color.BLACK);
        legend4 = new Shape(608, 283, 114, 2, Color.BLACK);
        
        window.addButton(previous, WindowSide.NORTH);
        window.addButton(sortArtistName, WindowSide.NORTH);
        window.addButton(sortSongTitle, WindowSide.NORTH);
        window.addButton(sortReleaseYear, WindowSide.NORTH);
        window.addButton(sortGenre, WindowSide.NORTH);
        window.addButton(next, WindowSide.NORTH);
        window.addButton(representHobby, WindowSide.SOUTH);
        window.addButton(representMajor, WindowSide.SOUTH);
        window.addButton(representRegion, WindowSide.SOUTH);
        window.addButton(quit, WindowSide.SOUTH);
        window.addShape(glyph);
        window.addShape(bar1);
        window.addShape(bar2);
        window.addShape(bar3);
        window.addShape(bar4);
        window.addShape(songText);
        window.addShape(songText2);
        window.addShape(legend1);
        window.addShape(legend2);
        window.addShape(legendTitle);
        window.addShape(option1);
        window.addShape(option2);
        window.addShape(option3);
        window.addShape(option4);
        window.addShape(exampleText);
        window.addShape(exampleShape);
        window.addShape(exampleText2);
        window.addShape(exampleText3);
        window.addShape(legend3);
        window.addShape(legend4);
    }
    
    public void clickedSortByGenre(Button button)
    {
        calculator.hobbySortedByGenre();
    }
    
    public void tempMethod()
    {
        calculator.hobbySortedByGenre();
        calculator.hobbySortedByTitle();
    }
}
