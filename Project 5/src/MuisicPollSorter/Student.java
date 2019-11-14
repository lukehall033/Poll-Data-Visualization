package MuisicPollSorter;

import java.util.ArrayList;

public class Student {

    private int id;
    private String date;
    private String major;
    private String region;
    private String hobby;
    private ArrayList<String> responses;


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


    public int getID() {
        return this.id;
    }


    public String getDate() {
        return this.date;
    }


    public String getMajor() {
        return this.major;
    }


    public String getRegion() {
        return this.region;
    }


    public String getHobby() {
        return this.hobby;
    }


    public ArrayList<String> getResponses() {
        return this.responses;
    }


    public String toString() {
        return ("Student " + getID() + " submitted on: " + getDate()
            + " and is a " + getMajor() + " major from " + getRegion()
            + " region and whos hobby is " + getHobby());
    }


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
