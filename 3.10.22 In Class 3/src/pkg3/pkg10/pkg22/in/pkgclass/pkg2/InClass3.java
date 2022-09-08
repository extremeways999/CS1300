package pkg3.pkg10.pkg22.in.pkgclass.pkg2;

public class InClass3 {

    public static void main(String[] args) {
        int week = 3;
        int days = 7;
        
        for(int i =1; i<=week; ++i){
            System.out.println("Weeks: " + i);
            for(int j = 1; j<=days; ++j){
                if(j%2!=0){
                    continue;
                }
                System.out.println("Days: " + j);
                }
        }
}
}
