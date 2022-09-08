import java.util.Scanner; //step 1 import

      
public class InClass{
    
    public static void main(String[]args) {
        
        Scanner scnr = new Scanner(System.in); //Step 2 create objects for Scanner
        int downpayment, paymentpermonth, nummonth, totalcost; 
        
        System.out.println("Enter the down payment: ");
        
        downpayment = scnr.nextInt(); //Step 3
        System.out.println("Enter monthly payment: ");
        paymentpermonth=scnr.nextInt();
        System.out.println("Enter number of months: "); 
        nummonth = scnr.nextInt();
        totalcost = downpayment + (paymentpermonth*nummonth);
        System.out.println("Total cost: " + totalcost); 
        System.out.println("edwin was here");
    }
} 
