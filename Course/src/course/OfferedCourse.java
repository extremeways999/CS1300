/*Edwin Ly, Homework 7 Lab 1: Course Number/Title, 5/1/2022*/
package course;
import java.util.Scanner; 
public class OfferedCourse extends Course{
    private String secondCourseNumber;
    private String secondCourseTitle;
    private String instructorName;
    private String term;
    private String classTime;
    
    OfferedCourse(){ //noarg constructor
        this.secondCourseNumber = "None";
        this.secondCourseTitle = "None"; 
        this.instructorName = "None";
        this.term = "None";
        this.classTime = "None"; 
    }
    OfferedCourse(String secondCourseNumber, String secondCourseTitle, String instructorName, String term, String classTime){ //parameterized constructor
        this.secondCourseNumber = secondCourseNumber;
        this.secondCourseTitle = secondCourseTitle; 
        this.instructorName = instructorName;
        this.term = term;
        this.classTime = classTime; 
    }
    public String getSecondCourseNumber(){
        return secondCourseNumber;
    }
    public String getSecondCourseTitle(){
        return secondCourseTitle;
    }
    public String getInstructorName(){ //getter methods
        return instructorName;
    }
    public String getTerm(){
        return term;
    }
    public String getClassTime(){
        return classTime;
    }
    public void printInfo2(){
        System.out.println("Course Information: ");
        System.out.println("Course Number: " + getSecondCourseNumber());
        System.out.println("Course Title: " + getSecondCourseTitle());
        System.out.println("Instructor Name: " + getInstructorName());
        System.out.println("Term: " + getTerm());
        System.out.println("Class Time: " + getClassTime());
    }
    public static void main(String[] args){
        Scanner scnr2 = new Scanner(System.in);
        System.out.println("Enter your Offered Course Number: ");
        String mySecondCourse = scnr2.nextLine();
        System.out.println("Enter your Offered Course Title : ");
        String mySecondTitle = scnr2.nextLine();
        System.out.println("Enter your Instructor Name: ");
        String myInstructorName = scnr2.nextLine();
        System.out.println("Enter your Term: ");
        String myTerm = scnr2.nextLine();
        System.out.println("Enter your Class Time: ");
        String myClassTime = scnr2.nextLine();
    }
}
