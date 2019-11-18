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
 * @author 
 * @author 
 * @author Allison Woods (awoods99)
 * @version 11/15/2019
 */
public class Student {

    private int id;
    private String date;
    private String major;
    private String region;
    private String hobby;
    private ArrayList<String> responses;

    /**
     * 
     * 
     * @param studentID
     * @param submitDate
     * @param studentMajor
     * @param studentRegion
     * @param studentHobby
     * @param studentResponses
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
     * @return
     */
    public int getID() {
        return this.id;
    }

    /**
     * 
     * 
     * @return
     */
    public String getDate() {
        return this.date;
    }

    /**
     * 
     * 
     * @return
     */
    public String getMajor() {
        return this.major;
    }

    /**
     * 
     * 
     * @return
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * 
     * 
     * @return
     */
    public String getHobby() {
        return this.hobby;
    }

    /**
     * 
     * 
     * @return
     */
    public ArrayList<String> getResponses() {
        return this.responses;
    }

    /**
     * 
     * 
     * @return
     */
    public String toString() {
        return ("Student " + getID() + " submitted on: " + getDate()
            + " and is a " + getMajor() + " major from " + getRegion()
            + " region and whos hobby is " + getHobby());
    }

    /**
     * 
     * 
     * @param obj
     * @return
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
