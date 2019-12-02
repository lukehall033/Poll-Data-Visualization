package prj5;

import java.awt.Color;
import CS2114.Button;
import CS2114.Window;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.WindowSide;

/**
 * f
 * 
 * @author lukeh
 * @version 11.18.2019
 */
public class GUIMusicWindow {

    /**
     * f
     */
    private MusicCalculator calculator;


    /**
     * f
     * 
     * @param calc
     *            calc
     */
    public GUIMusicWindow(MusicCalculator calc) {
        calculator = calc;
        Window window = new Window();
        window.setTitle("Project 5");
        Button previous = new Button("<- Prev");
        Button next = new Button("Next ->");
        Button sortArtistName = new Button("Sort by Artist Name");
        Button sortSongTitle = new Button("Sort by Song Title");
        Button sortReleaseYear = new Button("Sort by Release Year");
        Button sortGenre = new Button("Sort by Genre");

        sortGenre.onClick(this, "clickedSortByGenre");
        tempMethod();

        Button representHobby = new Button("Represent Hobby");
        Button representMajor = new Button("Represent Major");
        Button representRegion = new Button("Represent Region");
        Button quit = new Button("Quit");
        Shape glyph = new Shape(368, 120, 8, 48, Color.BLACK);
        Shape bar1 = new Shape(322, 120, 100, 12, Color.MAGENTA);
        Shape bar2 = new Shape(322, 132, 100, 12, Color.BLUE);
        Shape bar3 = new Shape(322, 144, 100, 12, Color.YELLOW);
        Shape bar4 = new Shape(322, 156, 100, 12, Color.GREEN);
        TextShape songText = new TextShape(290, 80,
            "Another One Bites The Dust");
        TextShape songText2 = new TextShape(335, 100, "by Queen");
        songText.setBackgroundColor(Color.WHITE);
        songText2.setBackgroundColor(Color.WHITE);
        Shape legend1 = new Shape(720, 115, 2, 170, Color.BLACK);
        Shape legend2 = new Shape(608, 115, 2, 170, Color.BLACK);
        TextShape legendTitle = new TextShape(615, 117, "Hobby Legend");
        TextShape option1 = new TextShape(615, 137, "Read", Color.MAGENTA);
        TextShape option2 = new TextShape(615, 157, "Art", Color.BLUE);
        TextShape option3 = new TextShape(615, 177, "Sports", new Color(237,
            237, 78));
        TextShape option4 = new TextShape(615, 197, "Music", Color.GREEN);
        TextShape exampleText = new TextShape(630, 217, "Song Title");
        Shape exampleShape = new Shape(663, 237, 8, 44, Color.BLACK);
        TextShape exampleText2 = new TextShape(619, 250, "Heard");
        TextShape exampleText3 = new TextShape(673, 250, "Likes");
        legendTitle.setBackgroundColor(Color.WHITE);
        option1.setBackgroundColor(Color.WHITE);
        option2.setBackgroundColor(Color.WHITE);
        option3.setBackgroundColor(Color.WHITE);
        option4.setBackgroundColor(Color.WHITE);
        exampleText.setBackgroundColor(Color.WHITE);
        exampleText2.setBackgroundColor(Color.WHITE);
        exampleText3.setBackgroundColor(Color.WHITE);
        Shape legend3 = new Shape(608, 115, 114, 2, Color.BLACK);
        Shape legend4 = new Shape(608, 283, 114, 2, Color.BLACK);

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


    /**
     * f
     * 
     * @param Button button
     */
    public void clickedSortByGenre(Button button) {
        calculator.hobbySortedByGenre();
    }


    /**
     * f
     */
    public void tempMethod() {
        calculator.hobbySortedByGenre();
        calculator.hobbySortedByTitle();
    }
}
