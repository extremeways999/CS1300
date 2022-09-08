/*Edwin Ly, Homework 7 Lab 1: Course Number/Title, 5/1/2022*/
package course;
import java.util.Scanner;

public class Course { /*want to get a coursenumber/title and display to user*/
    private String courseNumber;
    private String courseTitle;
    
    Course(){ //noarg constructor
        this.courseNumber = "None";
        this.courseTitle = "None";
    }
    
    Course(String courseNumber, String courseTitle){ //parameterized constructor 
        this.courseNumber = courseNumber;
        this.courseTitle = courseTitle;
    }
    
    public String getCourseNumber(){
        return courseNumber;
    }
    
    public String getCourseTitle(){
        return courseTitle;
    }
    
    public void printInfo(){
        System.out.println("Course Information: ");
        System.out.println("Course Number: " + getCourseNumber());
        System.out.println("Course Title: " + getCourseTitle());
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); //create new Scanner object
        System.out.println("Enter your Course Number: ");
        String myCourse = scnr.nextLine(); 
        System.out.println("Enter your Course Title: ");
        String myTitle = scnr.nextLine();
        Course example = new Course(myCourse, myTitle); /*create new Course object with parameters*/
        
        System.out.println("Enter your Offered Course Number: ");
        String mySecondCourse = scnr.nextLine();
        System.out.println("Enter your Offered Course Title : ");
        String mySecondTitle = scnr.nextLine();
        System.out.println("Enter your Instructor Name: ");
        String myInstructorName = scnr.nextLine();
        System.out.println("Enter your Term: ");
        String myTerm = scnr.nextLine();
        System.out.println("Enter your Class Time: ");
        String myClassTime = scnr.nextLine();
        OfferedCourse secondexample = new OfferedCourse(mySecondCourse, mySecondTitle, myInstructorName, myTerm, myClassTime);
        example.printInfo();
        secondexample.printInfo2(); 
    }
}

