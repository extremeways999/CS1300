import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author eleph
 */
public class InClass4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;
        userString = scnr.next();
        if (userString.equals("Quit")){
            System.out.println("Goodbye");
        }
        else {
            System.out.println("Hello\n");
        }
    }
    
}
