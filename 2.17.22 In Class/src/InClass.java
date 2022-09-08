import java.util.Scanner;
public class InClass {

    public static void main (String[]args) { 

        Scanner scnr = new Scanner(System.in);
        String firstname;
        String lastname; 
        System.out.print("Enter the first name: "); 
        firstname = scnr.nextLine(); 
        System.out.println("Enter the last name: ");
        lastname = scnr.nextLine(); 
        
        
        System.out.println();
        System.out.println("Welcome " + firstname + " " + lastname );
        System.out.println();
    }
}
