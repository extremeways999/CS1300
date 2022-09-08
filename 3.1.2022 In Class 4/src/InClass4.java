import java.util.Scanner;

public class InClass4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        
        do {
            System.out.println("Enter a number: ");
            number=input.nextInt();
        }
        while(number>=0); 
        System.out.println("Enter a number: ");
        number=input.nextInt();
        sum+=number;
        
        System.out.println("Sum: " + sum);
        }
    }
