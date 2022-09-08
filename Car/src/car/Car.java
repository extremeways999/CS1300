/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car;
public class Car {
    private int yearModel;
    private String make;
    private int speed; 
    Car(int yearModel, String make, int speed){
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }
    public int getyearModel(){
        return yearModel;
    }
    public String getmake(){
        return make;
    }
    public int getspeed(){
        return speed;
    }
    public void accelerate(){
        speed+=5; 
    }
    public void brake(){
        speed-=5;
    }
    public static void main(String[] args) {
        Car Mercedes = new Car(2022, "G-Wagen", 30);
        System.out.println("Accelerating");
        for(int i = 0; i<=4; i++){
            Mercedes.accelerate();
            System.out.println(Mercedes.getspeed());
        }
        System.out.println("Braking");
        for(int i = 0; i<=4; i++){
            Mercedes.brake();
            System.out.println(Mercedes.getspeed());
        }           
    }
}