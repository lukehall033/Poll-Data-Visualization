/**
 * 
 */
package MuisicPollSorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import bsh.ParseException;

/**
 * @author samkahn1
 *
 */
public class MusicReader {
    private Song[] songs;
    
    public MusicReader(String musicFileName, String surveyFileName)
    {
        
    }
    
    private Song[] readSongFile(String filename) throws Exception
    {
        Scanner scan = new Scanner(new File(filename));
        Song[] arraySongs = new Song[200];
        
        int counter = 0;
        while (scan.hasNextLine())
        {
            String result = scan.nextLine();
            String[] songList = result.split(",");
            
            String songName = songList[0];
            String bandName = songList[1];
            int year = Integer.valueOf(songList[2]);
            String genre = songList[3];
            
            if (songList.length < 4)
            {
                throw new ParseException();
            }
            
            Song newSong = new Song(songName, bandName, year, genre);
            counter++;
            arraySongs[counter] = newSong;
            
        }
        if (counter == 0)
        {
            throw new Exception();
        }
        return arraySongs;
    }
    
    private LinkedList<Student> readSurveyFile(String filename) throws FileNotFoundException
    {
        LinkedList<Student> student = new LinkedList<Student>();
        Scanner scan = new Scanner(new File(filename));
        
        while (scan.hasNextLine())
        {
            String result = scan.nextLine();
            String[] answers = result.split(",");
            
            int studentID = Integer.valueOf(answers[0]);
            int date = Integer.valueOf(answers[1]);
            String major = answers[2];
            String region = answers[3];
            String hobby = answers[4];
            
            int yesCounter = 0;
            int noCounter = 0;
            if (major != null && region != null && hobby != null)
            {
                //for (int i = 0; i < answers.length; i++)
                //{
                    //if (answers[i] == "YES")
                    //{
                        //yesCounter++;
                    //}
                    //else // possible bugs
                    //{
                        //noCounter++; 
                    //}
                
                ArrayList<String> studentAnswers = new ArrayList<String>();
                
                for (String s: answers)
                {
                    studentAnswers.add(s + 4);
                    
                }
                
                }
                
            
            
            else
            {
                throw new Exception();
            }
            
            //return yesCounter;
            //return noCounter;
            return studentAnswers;
            Student newStudent = new Student(studentID, date, major, region, hobby, studentAnswers);
            student.add(newStudent);
        }
        scan.close();
        return student;
        
        
        
        
    }

}
