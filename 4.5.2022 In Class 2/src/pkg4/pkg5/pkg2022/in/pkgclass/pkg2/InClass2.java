/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg5.pkg2022.in.pkgclass.pkg2;

//passing values to the main method 
public class InClass2 {

    public static void main(String[] args) {
        methodRankPoints(200);
    }
    public static void methodRankPoints (double points){
    if(points>=202.5){
        System.out.println("Rank A");
    }
    else if (points<202.5 && points >=122.4){
        System.out.println("Rank B");
    }
    
}
}
