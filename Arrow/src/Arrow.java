/*Edwin Ly
Lab 3: Arrow 
2/20/2022
 */

import java.util.Scanner;

public class Arrow {
    
    public static void main(String[] args) {
        
        System.out.print("Enter two integers with a space in the middle: ");
        
        Scanner input = new Scanner(System.in);
        
        int first = input.nextInt();
        
        int second = input.nextInt(); 
        
        System.out.println("     " + second);
        System.out.println("     " + second + second);
        System.out.println(first + "" + first + "" + first + "" +  first + "" + first + "" + second + "" + second + "" + second);
        System.out.println(first + "" + first + "" + first + "" + first + "" + first + "" + second + "" + second + "" + second + "" + second);
        System.out.println(first + "" + first + "" + first + "" + first + "" + first + "" + second + "" + second + "" + second);
        System.out.println("     " + second + second);
        System.out.println("     " + second);
    }
    
}
