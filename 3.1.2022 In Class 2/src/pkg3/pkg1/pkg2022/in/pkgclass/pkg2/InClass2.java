import java.util.Scanner;

public class InClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number=input.nextInt();
        
        while (number>=0){
            sum+=number;
            System.out.println("Enter a number");
        }
    }
    
}
