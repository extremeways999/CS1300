import java.util.Scanner;


/**
 *
 * @author eleph
 */
public class InClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is your age? ");
        int userAge;
        userAge=scnr.nextInt();
        if (userAge>=18&&(userAge<=25))
        {
            System.out.println("Eligible to party");
            
        }
        else{
            System.out.println("Not eligible to party"); 
        }
    }
    
}
