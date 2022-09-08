import java.util.Scanner; 

public class InClass2 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 8;
        int[] userVals = new int[NUM_ELEMENTS];
        int i;
        int sumVal;
        
        System.out.println("Enter: " + NUM_ELEMENTS + " integer values...");
        
        for(i = 0; i < userVals.length; ++i){
            System.out.print("Value: ");
            userVals[i] = scnr.nextInt();
        }
        
        sumVal =0;
    }
    
}
