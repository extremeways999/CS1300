/*Edwin Ly Lab 2: Average Rainfall 3/08/2022*/

import java.util.Scanner; 

public class InClass3Lab2 {

    public static void main(String[] args) {
        System.out.println("Enter the number of years: ");
        Scanner years = new Scanner(System.in);
        int y = years.nextInt();
        
        float total = 0; //total rainfall 
        for (int i = 0; i<y; i++){ //number of years that it will loop for 
            for(int j = 0; j<12; j++){ //number of months in a year 
                System.out.println("Enter the inches of rainfall for this month: ");
                Scanner rainfall = new Scanner(System.in);
                float r = rainfall.nextInt();
                total +=r;
            }
        }
        float nom = y * 12; //number of months (nom)
        System.out.println("Number of months: " + nom);
        System.out.println("Total inches of rainfall: " + total);
        System.out.println("Average rainfall per month: " + total/nom);
    }
}