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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import bsh.ParseException;

/**
 * 
 * Class that uses scanners to read the
 * informatin from the survey data files
 * 
 * @author Samantha Khan (ksamantha18)
 * @author Luke Hall (lukehall033)
 * @author Allison Woods (awoods99)
 * @version 11/18/2019
 */
public class MusicReader {
    /**
     * the list of songs that will be
     * used to store the songs from the
     * survey data
     */
    private Song[] songs;
    /**
     * the linkedList of student objects that
     * will store students created from the survey
     * data
     */
    private LinkedList<Student> students;


    /**
     * The MusicReader constructor, which takes both survey files
     * as parameters and calls both read methods, then creates
     * a new musicWindow with a musicCalculator with the song and
     * student list
     * 
     * @param musicFileName
     * @param surveyFileName
     * @throws FileNotFoundException
     * @throws ParseException
     * @throws Exception
     */
    public MusicReader(String musicFileName, String surveyFileName)
        throws FileNotFoundException {
        songs = readSongFile(musicFileName);
        students = readSurveyFile(surveyFileName);
        @SuppressWarnings("unused")
        GUIMusicWindow window = new GUIMusicWindow(new MusicCalculator(students,
            songs));
    }


    /**
     * 
     * this is the helped method that reads the
     * list of songs from the survey files, and
     * creates a list of availbale songs by
     * creating new song objects
     * 
     * @param filename
     * @return Song[] song list
     * @throws ParseException
     * @throws FileNotFoundException
     * @throws Exception
     */
    private Song[] readSongFile(String filename) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(filename));
        ArrayList<Song> list = new ArrayList<Song>();

        int counter = 0;
        scan.nextLine();
        while (scan.hasNextLine()) {
            String result = scan.nextLine();
            String[] songList = result.split(",");
            String songName = songList[0];
            String bandName = songList[1];
            int year = Integer.valueOf(songList[2]);
            String genre = songList[3];
            Song newSong = new Song(songName, bandName, year, genre);
            list.add(newSong);
            counter++;
        }
        scan.close();
        Song[] arraySongs = new Song[counter];
        for (int i = 0; i < list.size(); i++) {
            arraySongs[i] = list.get(i);
        }
        return arraySongs;
    }


    /**
     * 
     * helper method that scans through the students and
     * student responses from the survey data, and creates
     * a LinkedList of new student objects
     * 
     * @param filename
     * @return LinkedList<Student> list
     * @throws FileNotFoundException
     * @throws Exception
     */
    private LinkedList<Student> readSurveyFile(String filename)
        throws FileNotFoundException {
        LinkedList<Student> student = new LinkedList<Student>();
        Scanner scan = new Scanner(new File(filename));
        ArrayList<String> studentAnswers;
        scan.nextLine();
        while (scan.hasNextLine()) {
            String result = scan.nextLine();
            String[] answers = result.split(",");
            int studentID = Integer.valueOf(answers[0]);
            String date = (answers[1]);
            String major = answers[2];
            String region = answers[3];
            String hobby = answers[4];
            if (!major.equals("") && !region.equals("") && !hobby.equals("")) {
                studentAnswers = new ArrayList<String>();
                for (int i = 5; i < answers.length; i++) {
                    if (answers[i].length() == 0) {
                        studentAnswers.add("");
                    }
                    else {
                        studentAnswers.add(answers[i]);
                    }
                }
                Student newStudent = new Student(studentID, date, major, region,
                    hobby, studentAnswers);
                student.add(newStudent);
            }
        }
        scan.close();
        return student;
    }
}

