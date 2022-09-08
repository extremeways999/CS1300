/*Edwin Ly Lab 1: Reverse Binary 3/08/2022*/
import java.util.Scanner; 

public class InClass3Lab1 {

    public static void main(String[] args) {
        System.out.println("Enter an integer: ");  //will print out the number in reverse binary
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        while (x>0){
            System.out.print(x%2);
            x = x/2;
        }
        System.out.print("\n");
    }
}
