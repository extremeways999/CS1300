/*Edwin Ly
Lab 2: Simple Statistics
2/20/2022
 */
import java.util.Scanner;

public class SimpleStatistics {

    public static void main(String[] args) {   
        System.out.println("Input 4 integers without commas: ");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        
        int second = input.nextInt();
        
        int third = input.nextInt();
        
        int fourth = input.nextInt();
        
        int product = first * second * third * fourth;
        
        double product2 = first * second * third * fourth;
        
        int average = (first + second + third + fourth)/4;
        
        double average2 = (first + second + third + fourth)/4.0;
        
        System.out.println(product + " " + average);
        
        System.out.printf("%.3f ", product2);
        
        System.out.printf("%.3f\n", average2); 
    }
    
}
