/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbank;

abstract class Bank{
    abstract int getRateofInterest();
    
}

class SBI extends Bank{
    int getRateofInterest(){
        return 8;
    }
}
class PNB extends Bank{
    int getRateofInterest(){
        return 7;
    }
}

public class TestBank {

    public static void main(String[] args) {

        Bank b;
        b = new SBI(); 
        
        System.out.println("Rate of interest is: " + b.getRateofInterest() + "%");
        b = new PNB(); 
        System.out.println("Rate of interest is: " + b.getRateofInterest() + "%"); 
    }
    
}
