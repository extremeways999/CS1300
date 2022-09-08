import java.util.Scanner; /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author eleph
 */
public class InClass3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int hotelrate;
        int numyear;
        hotelrate=150;
        System.out.println("Enter year married: ");
        numyear = scnr.nextInt();
        if(numyear==50){
            System.out.println("Congrats on 50 years"); 
            System.out.println("Of Marriage"); 
            hotelrate=hotelrate/2;
            
        }
        System.out.println("Your hotel rate: ");
            System.out.println(hotelrate);
    }
    
}
