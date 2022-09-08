/*
Edwin Ly
Lab 1: Gregorian Calendar
2/24/2022
 */
import java.util.Scanner; 
public class InClass2Lab1 {

    public static void main(String[] args) {

        System.out.println("Enter the year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        
        if (year%4==0) { //modulo to make sure that it is divisible by 4 
            if (year%100==0 && year%400==0){
                System.out.println(year + "- leap year");
            }
            else{
                System.out.print(year + "- leap year");
            }
        }
        else{
            System.out.println(year + "- not a leap year");
        }
        
    }
    
}
