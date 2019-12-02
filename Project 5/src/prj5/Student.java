/**
 * Virginia Tech Honor Code Pledge:
 *
 * As a Hokie, I will conduct myself with honor
 * and integrity at all times.
 * I will not lie, cheat, or steal, nor will I
 * accept the actions of those who do.
 * -- Allison Woods (awoods99)
 * --
 * --
 */
package prj5;

import java.util.ArrayList;

/**
 * 
 * 
<<<<<<< HEAD
 * @author
=======
 * 
>>>>>>> branch 'master' of https://github.com/lukehall033/Project5.git
 * @author Luke Hall (lukeh)
 * @author Allison Woods (awoods99)
 * @version 11/15/2019
 */
public class Student {

    /**
     * f
     */
    private int id;
    /**
     * f
     */
    private String date;
    /**
     * f
     */
    private String major;
    /**
     * f
     */
    private String region;
    /**
     * f
     */
    private String hobby;
    /**
     * f
     */
    private ArrayList<String> responses;


    /**
     * 
     * 
     * @param studentID f
     * @param submitDate f
     * @param studentMajor f
     * @param studentRegion f
     * @param studentHobby f
     * @param studentResponses f
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
     * 
     * @return int id
     */
    public int getID() {
        return this.id;
    }


    /**
     * 
     * 
     * @return String date
     */
    public String getDate() {
        return this.date;
    }


    /**
     * 
     * 
     * @return String major
     */
    public String getMajor() {
        return this.major;
    }


    /**
     * 
     * 
     * @return String region
     */
    public String getRegion() {
        return this.region;
    }


    /**
     * 
     * 
     * @return String hobby
     */
    public String getHobby() {
        return this.hobby;
    }


    /**
     * 
     * 
     * @return ArrayList<String> responses
     */
    public ArrayList<String> getResponses() {
        return this.responses;
    }


    /**
     * 
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
     * 
     * @param obj obj
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
