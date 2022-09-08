package pkg3.pkg10.pkg22.in.pkgclass.pkg2;

public class InClass2 {

    public static void main(String[] args) {
        int week = 3;
        int days = 7;
        int i = 1;
        
        while(i<=week){
            System.out.println("Weeks: " + i);
            
            for(int j = 1; j<=days; j++){
                System.out.println("Days: " + j);
            }
            i++;
        }
    }
}
