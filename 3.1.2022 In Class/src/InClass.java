import java.util.Scanner;

/**
 *
 * @author eleph
 */
public class InClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sum = 0; value, count = 0;
        double average;
        
        Scanner scan = new Scanner(System.in);
        
        
        while (value !=0){
            count++;
            sum +=value;
            System.out.println("The sum so far is " + sum);
            
            System.out.println("Enter an integer (0 to quit): ");
            value=scan.nextInt();
            
        }
    }
    
}
