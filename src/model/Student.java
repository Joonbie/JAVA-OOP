package model;

import java.util.ArrayList;

public class Student {

    // Properties of Student
    String name;

    String id;


    // A student can enroll in one Or more courses - this a List or ArrayList is required
    ArrayList<Course> enrolledCourses = new ArrayList<Course>();

    // Default constructor of Student
    // Right-click and click generate to generate a constructor based on the public class
    public Student(String name, String id) {
        this.name = name;
        this.id = id;

    }

    // Overloaded contructor of Student
    // Creating a new instance of Student but not using it yet
    public Student() {
        this.name = "";
        this.id = "";
    }

    // getters() for Student to return name or id
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // setters() for Student to store the name and id
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Student{" + "name='" + name + '\'' + ", id='" + id + '\''  + '}';
    }

    // Public method to enroll student to a course
    public void enroll(Course course){
        enrolledCourses.add(course);
    }

    // Public method to un-enroll student from a course
    public void unEnroll(Course course){
        enrolledCourses.remove(course);
    }

    // Public method to return the number of courses student enrolled
    public int totalEnrolledCourses(){
        // returns the number of courses a student is enrolled into
        return enrolledCourses.size();
    }

    // Public method to return the enrolled courses' information
    public ArrayList<Course> getEnrolledCourses(){
        return enrolledCourses;
    }



}
