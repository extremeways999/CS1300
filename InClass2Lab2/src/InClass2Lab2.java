/*Edwin Ly Lab 2: Pennies change 2/24/2022
 */
import java.util.Scanner; 
public class InClass2Lab2 {

    public static void main(String[] args) {
        System.out.println("Input penny amount: ");
        Scanner input = new Scanner(System.in);
        int change = input.nextInt();
        int remainder = change;
        if (change == 0){
            System.out.println("No change");
        }
        String dollarsp = " dollars", quartersp = " quarters", dimesp = " dimes", nickelsp = " nickels", penniesp = " pennies";
        int dollar = remainder /100;
        remainder %=100;
        int quarter = remainder/25;
        remainder %=25;
        int dime = remainder/10;
        remainder %=10;
        int nickel = remainder/5;
        remainder %=5;
        int penny = remainder/1;
        if (dollar > 1){
            System.out.println(dollar + dollarsp);
        }
        else if (dollar == 1){
            dollarsp = " dollar";
            System.out.println(dollar + dollarsp);
        }
        if (quarter > 1){
            System.out.println(quarter + quartersp);
        }
        else if (quarter == 1){
            quartersp = " quarter";
            System.out.println(quarter + quartersp);
        }
        if (dime > 1){
            System.out.println(dime + dimesp);
        }
        else if (dime==1) {
            dimesp = " dime";
            System.out.println(dime + dimesp);
        }
        if (nickel > 1){
            nickelsp = " nickel";
            System.out.println(nickel + nickelsp);
        }
        else if (nickel==1){
            nickelsp = " nickel";
            System.out.println(nickel + nickelsp);
        }
        if (penny > 1){
             System.out.println(penny + penniesp);
        }
         else if (penny == 1){
            penniesp = " penny";
            System.out.println(penny + penniesp);
        }
    }
}