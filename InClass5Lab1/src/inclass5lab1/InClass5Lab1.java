/*Edwin Ly In Class 5 Lab 1 Test Scores 4/12/22 */
package inclass5lab1;
import java.util.Scanner;
public class InClass5Lab1 {

    public static int calcAverage(double score1, double score2, double score3, double score4, double score5){
        double average = (score1+score2+score3+score4+score5)/5;
        return (int)average;
    }
    
    public static String determineGrade(double average){
        String grade = "None";
        if(average>=90 && average<=100){
            grade = "A";
        }
        if(average>=80 && average<=89){
            grade = "B";
        }
        if(average>=70 && average<=79){
            grade = "C";
        }
        if(average>=60 && average<=69){
            grade = "D";
        }
        if(average<60){
            grade = "F";
        }
        return grade;
    }
    
    public static void main(String[] args) {
       System.out.println("Enter a list: ");
       Scanner scnr = new Scanner(System.in);
       double test1, test2, test3, test4, test5;
       test1 = scnr.nextDouble();
       test2 = scnr.nextDouble();
       test3 = scnr.nextDouble();
       test4 = scnr.nextDouble();
       test5 = scnr.nextDouble();
       double average = calcAverage(test1, test2, test3, test4, test5);
       System.out.println("Score average: " + calcAverage(test1, test2, test3, test4, test5));
       System.out.println("Grade: " + determineGrade(average));
    }
}
