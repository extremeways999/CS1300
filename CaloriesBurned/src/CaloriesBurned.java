/*Edwin Ly
Lab 1: Expression for calories burned during workout 
2/20/2022
*/

import java.util.Scanner;
       
public class CaloriesBurned {

    public static void main(String[] args) {
        
        System.out.println("Enter your age (years), weight (pounds), heart rate (beats per minute) and time (minutes):" );
        Scanner age_reader = new Scanner(System.in);
        double age = age_reader.nextInt();

        double weight = age_reader.nextInt();
        
        double heart_rate = age_reader.nextInt();
        
        double time = age_reader.nextInt();
        
        double calories = ((age*0.2757) + (weight*0.03295) + (heart_rate*1.0781)-75.4991) * time/8.368;  
        
        System.out.printf("%.2f", calories); 
        System.out.print(" calories\n");
    }
    
}
