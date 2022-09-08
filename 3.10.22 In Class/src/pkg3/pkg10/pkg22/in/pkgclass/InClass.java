/* */
package pkg3.pkg10.pkg22.in.pkgclass;

public class InClass {

    public static void main(String[] args) {
        int week = 3;
        int days = 7;
        //outer loop to print the number of weeks
        for(int i = 1; i<=week; i++){
            System.out.println("Weeks: " + i);
            //inner loop to print the number of days;
            for(int j = 1; j<=days; j++){
                System.out.println("Days: " + j); 
            }
        }
    }
}
