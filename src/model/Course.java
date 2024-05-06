package model;

import java.util.ArrayList;

public class Course {

    // Properties of model.Course (default as private)
    String name;
    String id;
    int credits;


    // Default Constructor for model.Course
    public Course(String name, String id, int credits) {
        this.name = name;
        this.id = id;
        this.credits = credits;

    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" + "name='" + name + "\'" + ", " + "id='" + id + "\'" + "}";
    }

}
