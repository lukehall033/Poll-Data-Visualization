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

import java.util.ArrayList;

/**
 * 
 * Creates a student object, that stores the information
 * from the survey data
 * 
 * @author Samantha Kahn (ksamantha18)
 * @author Luke Hall (lukeh)
 * @author Allison Woods (awoods99)
 * @version 11/15/2019
 */
public class Student {

    /**
     * students ID
     */
    private int id;
    /**
     * date the student submitted
     */
    private String date;
    /**
     * students major
     */
    private String major;
    /**
     * students region
     */
    private String region;
    /**
     * students hobby
     */
    private String hobby;
    /**
     * the list of students responses
     */
    private ArrayList<String> responses;


    /**
     * 
     * the constructor for student
     * 
     * @param studentID
     *            ID
     * @param submitDate
     *            date
     * @param studentMajor
     *            major
     * @param studentRegion
     *            region
     * @param studentHobby
     *            hobby
     * @param studentResponses
     *            responses
     */
    public Student(
        int studentID,
        String submitDate,
        String studentMajor,
        String studentRegion,
        String studentHobby,
        ArrayList<String> studentResponses) {
        id = studentID;
        date = submitDate;
        major = studentMajor;
        region = studentRegion;
        hobby = studentHobby;
        responses = studentResponses;
    }


    /**
     * 
     * returns students ID
     * 
     * @return int id
     */
    public int getID() {
        return this.id;
    }


    /**
     * 
     * returns date of submission for the student
     * 
     * @return String date
     */
    public String getDate() {
        return this.date;
    }


    /**
     * 
     * returns students major
     * 
     * @return String major
     */
    public String getMajor() {
        return this.major;
    }


    /**
     * 
     * returns students region
     * 
     * @return String region
     */
    public String getRegion() {
        return this.region;
    }


    /**
     * 
     * returns students hobby
     * 
     * @return String hobby
     */
    public String getHobby() {
        return this.hobby;
    }


    /**
     * 
     * returns the arrayList of the students
     * responses
     * 
     * @return ArrayList<String> responses
     */
    public ArrayList<String> getResponses() {
        return this.responses;
    }


    /**
     * 
     * returns a string representation of
     * the students fields
     * 
     * @return String toString
     */
    public String toString() {
        return ("Student " + getID() + " submitted on: " + getDate()
            + " and is a " + getMajor() + " major from " + getRegion()
            + " region and whos hobby is " + getHobby());
    }


    /**
     * 
     * compares to students for equality
     * 
     * @param obj
     *            comparing object
     * @return boolean bool
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (this.getClass() == obj.getClass()) {
            Student student = (Student)obj;
            return (this.getID() == student.getID() && this.getDate().equals(
                student.getDate()) && this.getMajor().equals(student.getMajor())
                && this.getRegion().equals(student.getRegion()) && this
                    .getHobby().equals(student.getHobby()) && this
                        .getResponses().equals(student.getResponses()));
        }
        else {
            return false;
        }
    }
}
