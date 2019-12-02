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

import java.awt.Color;
import java.util.ArrayList;
import CS2114.Button;
import CS2114.Window;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.WindowSide;

/**
 * 
 * This is the front end class, that creates the window and
 * utlizes MusicCalculator methods to display the proper data and
 * graphics
 * 
 * @author Luke Hall (lukehall033)
 * @author Allison Woods (awoods99)
 * @author Samantha Khan (ksamantha18)
 * @version 11/18/2019
 */
public class GUIMusicWindow {

    /**
     * the MusicCalculator thats passed to this class
     */
    private MusicCalculator calculator;
    /**
     * the window thats created
     */
    private Window window;
    /**
     * the title TextShape for the legend
     */
    private TextShape legendTitle;
    /**
     * the text for the first option for each representation
     */
    private TextShape option1;
    /**
     * the text for the second option for each representation
     */
    private TextShape option2;
    /**
     * the text for the third option for each representation
     */
    private TextShape option3;
    /**
     * the text for the fourth option for each representation
     */
    private TextShape option4;
    /**
     * one of the sides of the legend box
     */
    private Shape legend1;
    /**
     * one of the sides of the legend box
     */
    private Shape legend2;
    /**
     * one of the sides of the legend box
     */
    private Shape legend3;
    /**
     * one of the sides of the legend box
     */
    private Shape legend4;
    /**
     * the shape for the example glyph in the legend
     */
    private Shape exampleGlyph;
    /**
     * the title for the example glyph in the legend
     */
    private TextShape exampleTitle;
    /**
     * the "heard" text in the legend
     */
    private TextShape exampleHeard;
    /**
     * the "liked" text in the legend
     */
    private TextShape exampleLikes;
    /**
     * the previous button
     */
    private Button previous;
    /**
     * the next button
     */
    private Button next;
    /**
     * an integer to represent the current page number
     */
    private int pageNum = 1;
    /**
     * an integer to represent the current sort
     */
    private int sort = 0;
    /**
     * an arraylist to store the many glyph shape objects
     */
    private ArrayList<Shape> glyphs = new ArrayList<Shape>();
    /**
     * an arraylist to store the many song title textshapes
     */
    private ArrayList<TextShape> songText = new ArrayList<TextShape>();
    /**
     * an arraylist to store the many song artist textshapes
     */
    private ArrayList<TextShape> artistText = new ArrayList<TextShape>();
    /**
     * an arraylist to store the colored percentage bars on each page for each
     * song
     */
    private ArrayList<Shape> bars = new ArrayList<Shape>();


    /**
     * 
     * the constructor for GUIMusicWindow, which creates the buttons
     * 
     * @param calc
     *            calculator
     */
    public GUIMusicWindow(MusicCalculator calc) {
        calculator = calc;
        window = new Window();
        window.setTitle("lukehall033 ksamantha18 awoods99");
        previous = new Button("<- Prev");
        previous.onClick(this, "clickedPrev");
        next = new Button("Next ->");
        next.onClick(this, "clickedNext");

        Button sortArtistName = new Button("Sort by Artist Name");
        sortArtistName.onClick(this, "clickedSortByArtistName");
        Button sortSongTitle = new Button("Sort by Song Title");
        sortSongTitle.onClick(this, "clickedSortByTitle");
        Button sortReleaseYear = new Button("Sort by Release Year");
        sortReleaseYear.onClick(this, "clickedSortByReleaseYear");
        Button sortGenre = new Button("Sort by Genre");
        sortGenre.onClick(this, "clickedSortByGenre");

        Button representHobby = new Button("Represent Hobby");
        representHobby.onClick(this, "clickedRepresentHobby");
        Button representMajor = new Button("Represent Major");
        representMajor.onClick(this, "clickedRepresentMajor");
        Button representRegion = new Button("Represent Region");
        representRegion.onClick(this, "clickedRepresentRegion");

        Button quit = new Button("Quit");
        quit.onClick(this, "clickedQuit");

        @SuppressWarnings("unused")
        Shape glyph = new Shape(368, 120, 8, 48, Color.BLACK);
        @SuppressWarnings("unused")
        Shape bar1 = new Shape(322, 120, 100, 12, Color.MAGENTA);
        @SuppressWarnings("unused")
        Shape bar2 = new Shape(322, 132, 100, 12, Color.BLUE);
        @SuppressWarnings("unused")
        Shape bar3 = new Shape(322, 144, 100, 12, Color.YELLOW);
        @SuppressWarnings("unused")
        Shape bar4 = new Shape(322, 156, 100, 12, Color.GREEN);
        TextShape songText = new TextShape(290, 80,
            "Another One Bites The Dust");
        TextShape songText2 = new TextShape(335, 100, "by Queen");
        songText.setBackgroundColor(Color.WHITE);
        songText2.setBackgroundColor(Color.WHITE);
        legend1 = new Shape(720, 115, 2, 170, Color.BLACK);
        legend2 = new Shape(608, 115, 2, 170, Color.BLACK);
        legendTitle = new TextShape(615, 117, "Hobby Legend");
        option1 = new TextShape(615, 137, "Read", Color.MAGENTA);
        option2 = new TextShape(615, 157, "Art", Color.BLUE);
        option3 = new TextShape(615, 177, "Sports", new Color(237, 237, 78));
        option4 = new TextShape(615, 197, "Music", Color.GREEN);
        exampleTitle = new TextShape(630, 217, "Song Title");
        exampleGlyph = new Shape(663, 237, 8, 44, Color.BLACK);
        exampleHeard = new TextShape(619, 250, "Heard");
        exampleLikes = new TextShape(673, 250, "Likes");
        legendTitle.setBackgroundColor(Color.WHITE);
        option1.setBackgroundColor(Color.WHITE);
        option2.setBackgroundColor(Color.WHITE);
        option3.setBackgroundColor(Color.WHITE);
        option4.setBackgroundColor(Color.WHITE);
        exampleTitle.setBackgroundColor(Color.WHITE);
        exampleHeard.setBackgroundColor(Color.WHITE);
        exampleLikes.setBackgroundColor(Color.WHITE);
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

        previous.disable();
    }


    /**
     * 
     * This method gives function to the sort by genre button,
     * and sorts the list of songs accordingly, then updates the window
     * 
     * @param Button
     *            button
     */
    public void clickedSortByGenre(Button button) {
        calculator.sortedByGenre();
        displayGlyphs();
    }


    /**
     * 
     * This method gives function to the sort by title button,
     * and sorts the list of songs accordingly, then updates the window
     * 
     * @param Button
     *            button
     */
    public void clickedSortByTitle(Button button) {
        calculator.sortedByTitle();
        displayGlyphs();
    }


    /**
     * 
     * This method gives function to the sort by artist name button,
     * and sorts the list of songs accordingly, then updates the window
     * 
     * @param Button
     *            button
     */
    public void clickedSortByArtistName(Button button) {
        calculator.sortedByArtistName();
        displayGlyphs();
    }


    /**
     * 
     * This method gives function to the sort by release year button,
     * and sorts the list of songs accordingly, then updates the window
     * 
     * @param Button
     *            button
     */
    public void clickedSortByReleaseYear(Button button) {
        calculator.sortedByReleaseYear();
        displayGlyphs();
    }


    /**
     * 
     * This method gives function to the represent hobby button,
     * and changes the legend and which percentage bars are shown accordingly,
     * then updates the shapes on the window
     * 
     * @param button
     *            button
     */
    public void clickedRepresentHobby(Button button) {
        window.removeShape(legendTitle);
        window.removeShape(option1);
        window.removeShape(option2);
        window.removeShape(option3);
        window.removeShape(option4);
        legendTitle = new TextShape(615, 117, "Hobby Legend");
        option1 = new TextShape(615, 137, "Read", Color.MAGENTA);
        option2 = new TextShape(615, 157, "Art", Color.BLUE);
        option3 = new TextShape(615, 177, "Sports", new Color(237, 237, 78));
        option4 = new TextShape(615, 197, "Music", Color.GREEN);
        legendTitle.setBackgroundColor(Color.WHITE);
        option1.setBackgroundColor(Color.WHITE);
        option2.setBackgroundColor(Color.WHITE);
        option3.setBackgroundColor(Color.WHITE);
        option4.setBackgroundColor(Color.WHITE);
        window.addShape(legendTitle);
        window.addShape(option1);
        window.addShape(option2);
        window.addShape(option3);
        window.addShape(option4);
        window.addShape(exampleTitle);
        window.addShape(exampleGlyph);
        window.addShape(exampleHeard);
        window.addShape(exampleLikes);
        window.addShape(legend1);
        window.addShape(legend2);
        window.addShape(legend3);
        window.addShape(legend4);
        sort = 0;
        displayGlyphs();
    }


    /**
     * 
     * This method gives function to the represent region button,
     * and changes the legend and which percentage bars are shown accordingly,
     * then updates the shapes on the window
     * 
     * @param button
     *            button
     */
    public void clickedRepresentRegion(Button button) {
        window.removeShape(legendTitle);
        window.removeShape(option1);
        window.removeShape(option2);
        window.removeShape(option3);
        window.removeShape(option4);
        legendTitle = new TextShape(615, 117, "Region Legend");
        option1 = new TextShape(615, 137, "Northeast US", Color.MAGENTA);
        option2 = new TextShape(615, 157, "Southeast US", Color.BLUE);
        option3 = new TextShape(615, 177, "Rest of the US", new Color(237, 237,
            78));
        option4 = new TextShape(615, 197, "Outside the US", Color.GREEN);
        legendTitle.setBackgroundColor(Color.WHITE);
        option1.setBackgroundColor(Color.WHITE);
        option2.setBackgroundColor(Color.WHITE);
        option3.setBackgroundColor(Color.WHITE);
        option4.setBackgroundColor(Color.WHITE);
        window.addShape(legendTitle);
        window.addShape(option1);
        window.addShape(option2);
        window.addShape(option3);
        window.addShape(option4);
        window.addShape(exampleTitle);
        window.addShape(exampleGlyph);
        window.addShape(exampleHeard);
        window.addShape(exampleLikes);
        window.addShape(legend1);
        window.addShape(legend2);
        window.addShape(legend3);
        window.addShape(legend4);
        sort = 1;
        displayGlyphs();
    }


    /**
     * 
     * This method gives function to the represent major button,
     * and changes the legend and which percentage bars are shown accordingly,
     * then updates the shapes on the window
     * 
     * @param button
     *            button
     */
    public void clickedRepresentMajor(Button button) {
        window.removeShape(legendTitle);
        window.removeShape(option1);
        window.removeShape(option2);
        window.removeShape(option3);
        window.removeShape(option4);
        legendTitle = new TextShape(615, 117, "Major Legend");
        option1 = new TextShape(615, 137, "Comp Sci", Color.MAGENTA);
        option2 = new TextShape(615, 157, "Other Eng", Color.BLUE);
        option3 = new TextShape(615, 177, "Math/CMDA", new Color(237, 237, 78));
        option4 = new TextShape(615, 197, "Other", Color.GREEN);
        legendTitle.setBackgroundColor(Color.WHITE);
        option1.setBackgroundColor(Color.WHITE);
        option2.setBackgroundColor(Color.WHITE);
        option3.setBackgroundColor(Color.WHITE);
        option4.setBackgroundColor(Color.WHITE);
        window.addShape(legendTitle);
        window.addShape(option1);
        window.addShape(option2);
        window.addShape(option3);
        window.addShape(option4);
        window.addShape(exampleTitle);
        window.addShape(exampleGlyph);
        window.addShape(exampleHeard);
        window.addShape(exampleLikes);
        window.addShape(legend1);
        window.addShape(legend2);
        window.addShape(legend3);
        window.addShape(legend4);
        sort = 2;
        displayGlyphs();
    }


    /**
     * 
     * gives function to the quit button, and exits the window
     * 
     * @param button
     *            button
     */
    public void clickedQuit(Button button) {
        System.exit(0);
    }


    /**
     * 
     * gives function to the next button, and increases the page number
     * by 1, disables itself if theres no more pages
     * 
     * @param button
     *            button
     */
    public void clickedNext(Button button) {
        previous.enable();
        pageNum++;
        if (pageNum == (int)Math.ceil((double)calculator.getSongs().length
            / 9.0)) {
            next.disable();
        }
        displayGlyphs();
    }


    /**
     * 
     * gives function to the previous button, and decreases the page number
     * by 1, disables itself if its at the first page
     * 
     * @param button
     */
    public void clickedPrev(Button button) {
        next.enable();
        pageNum--;
        if (pageNum == 1) {
            previous.disable();
        }
        displayGlyphs();
    }


    /**
     * 
     * This method updates the window with the proper glyphs, legend, percentage
     * bars, and
     * sorted display based upon the order of the songlist, as well as what
     * representation was clicked last
     * 
     */
    public void displayGlyphs() {
        for (int k = 0; k < glyphs.size(); k++) {
            window.removeShape(glyphs.get(k));
            window.removeShape(songText.get(k));
            window.removeShape(artistText.get(k));
        }
        for (int f = 0; f < glyphs.size() * 8; f++) {
            window.removeShape(bars.get(f));
        }
        bars.clear();
        songText.clear();
        artistText.clear();
        glyphs.clear();
        ArrayList<String> songTitles = new ArrayList<String>();
        ArrayList<String> songArtists = new ArrayList<String>();
        int val = pageNum * 9;
        if (val > calculator.getSongs().length) {
            val = calculator.getSongs().length;
        }
        for (int i = ((pageNum - 1) * 9); i < val; i++) {
            songTitles.add(calculator.getSongs()[i].getName());
            songArtists.add(calculator.getSongs()[i].getArtist());
        }
        for (int j = 1; j < songTitles.size() + 1; j++) {
            int[] temp = new int[8];
            int num = (pageNum - 1) * 9;
            int x = 0;
            int y = 0;
            if (j == 1 || j == 4 || j == 7) {
                x = 125;
            }
            if (j == 2 || j == 5 || j == 8) {
                x = 320;
            }
            if (j == 3 || j == 6 || j == 9) {
                x = 515;
            }
            if (j > 0 && j < 4) {
                y = 40;
            }
            if (j > 3 && j < 7) {
                y = 130;
            }
            if (j > 6 && j < 10) {
                y = 220;
            }
            if (sort == 0) {
                temp = calculator.calcForHobby(calculator.getSongs()[j - 1
                    + num]);
            }
            if (sort == 1) {
                temp = calculator.calcForRegion(calculator.getSongs()[j - 1
                    + num]);
            }
            if (sort == 2) {
                temp = calculator.calcForMajor(calculator.getSongs()[j - 1
                    + num]);
            }
            Shape glyph = new Shape(x, y, 8, 48, Color.BLACK);
            TextShape title = new TextShape(x, y, songTitles.get(j - 1),
                Color.BLACK);
            TextShape artist = new TextShape(x, y, "by " + songArtists.get(j
                - 1), Color.BLACK);
            Shape bar1 = new Shape(x + 8, y, temp[1], 12, Color.MAGENTA);
            Shape bar2 = new Shape(x + 8, y + 12, temp[3], 12, Color.BLUE);
            Shape bar3 = new Shape(x + 8, y + 24, temp[5], 12, new Color(237,
                237, 78));
            Shape bar4 = new Shape(x + 8, y + 36, temp[7], 12, Color.GREEN);
            Shape bar5 = new Shape(x - temp[0], y, temp[0], 12, Color.MAGENTA);
            Shape bar6 = new Shape(x - temp[2], y + 12, temp[2], 12,
                Color.BLUE);
            Shape bar7 = new Shape(x - temp[4], y + 24, temp[4], 12, new Color(
                237, 237, 78));
            Shape bar8 = new Shape(x - temp[6], y + 36, temp[6], 12,
                Color.GREEN);
            title.move(-title.getWidth() / 2, -32);
            artist.move(-artist.getWidth() / 2, -17);
            title.setBackgroundColor(Color.WHITE);
            artist.setBackgroundColor(Color.WHITE);
            songText.add(title);
            artistText.add(artist);
            glyphs.add(glyph);
            bars.add(bar1);
            bars.add(bar2);
            bars.add(bar3);
            bars.add(bar4);
            bars.add(bar5);
            bars.add(bar6);
            bars.add(bar7);
            bars.add(bar8);
            window.addShape(bar1);
            window.addShape(bar2);
            window.addShape(bar3);
            window.addShape(bar4);
            window.addShape(bar5);
            window.addShape(bar6);
            window.addShape(bar7);
            window.addShape(bar8);
        }
        for (int g = 0; g < glyphs.size(); g++) {
            window.addShape(glyphs.get(g));
            window.addShape(songText.get(g));
            window.addShape(artistText.get(g));
        }
    }
}
