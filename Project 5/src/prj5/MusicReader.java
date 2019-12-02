/**
 * 
 */
package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import bsh.ParseException;

/**
 * @author samkahn1
 * @version 11.18.2019
 */
public class MusicReader {
    /**
     * f
     */
    private Song[] songs;
    /**
     * f
     */
    private LinkedList<Student> students;


    /**
     * f
     * 
     * @param musicFileName
     * @param surveyFileName
     * @throws FileNotFoundException 
     * @throws ParseException 
     * @throws Exception
     */
<<<<<<< HEAD
    public MusicReader(String musicFileName, String surveyFileName)
        throws Exception {
=======
    public MusicReader(String musicFileName, String surveyFileName) throws FileNotFoundException
    {
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
        songs = readSongFile(musicFileName);
        students = readSurveyFile(surveyFileName);
<<<<<<< HEAD
        MusicWindow window = new MusicWindow(new MusicCalculator(students,
            songs));
=======
        GUIMusicWindow window = new GUIMusicWindow(new MusicCalculator(students, songs));
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
    }


    /**
     * f
     * 
     * @param filename
     * @return
     * @throws ParseException 
     * @throws FileNotFoundException 
     * @throws Exception
     */
<<<<<<< HEAD
    private Song[] readSongFile(String filename) throws Exception {
=======
    private Song[] readSongFile(String filename) throws FileNotFoundException
    {
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(new File(filename));
        // Song[] arraySongs = new Song[70];
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
<<<<<<< HEAD

            if (songList.length < 4) {
                throw new ParseException();
            }

=======
             

                
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
            Song newSong = new Song(songName, bandName, year, genre);
            // arraySongs[counter] = newSong;
            list.add(newSong);
            counter++;
        }
<<<<<<< HEAD
        if (counter == 0) {
            throw new Exception();
        }
=======
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
        scan.close();
        Song[] arraySongs = new Song[counter];
        for (int i = 0; i < list.size(); i++) {
            arraySongs[i] = list.get(i);
        }
        return arraySongs;
    }


    /**
     * f
     * 
     * @param filename
     * @return
     * @throws FileNotFoundException 
     * @throws Exception
     */
<<<<<<< HEAD
    private LinkedList<Student> readSurveyFile(String filename)
        throws Exception {
=======
    private LinkedList<Student> readSurveyFile(String filename) throws FileNotFoundException
    {
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
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

            // int yesCounter = 0;
            // int noCounter = 0;
            if (!major.equals("") && !region.equals("") && !hobby.equals("")) {
                // for (int i = 0; i < answers.length; i++)
                // {
                // if (answers[i] == "YES")
                // {
                // yesCounter++;
                // }
                // else // possible bugs
                // {
                // noCounter++;
                // }

                studentAnswers = new ArrayList<String>();

// for (String s: answers)
// {
// studentAnswers.add(s + 4);
//
// }
//
// }
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

// else
// {
// throw new Exception();
// }

            // return yesCounter;
            // return noCounter;

        }
        scan.close();
        return student;

    }

}
