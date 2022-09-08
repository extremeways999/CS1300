/*Edwin Ly Homework 6-Lab 2 Nutritional Information4/24/2022 */
package fooditem;
import java.util.Scanner; 
public class FoodItem {
    
    private String foodname;
    private double gramsoffat;
    private double gramsofcarbs;
    private double gramsofprotein; 

    FoodItem(){
        foodname = "None";
        gramsoffat = 0.0;
        gramsofcarbs = 0.0;
        gramsofprotein = 0.0; 
    }
    
    FoodItem(String foodname, double gramsoffat, double gramsofcarbs, double gramsofprotein){
        this.foodname = foodname; 
        this.gramsoffat = gramsoffat;
        this.gramsofcarbs = gramsofcarbs;
        this.gramsofprotein = gramsofprotein;
    }
    
    public double getcalories(double anumofservings){
        double totalcalories = gramsoffat*9 + gramsofcarbs*4 + gramsofprotein*4;
        return totalcalories*anumofservings; 
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter food name: ");
        String afoodname = scnr.nextLine();
        System.out.println("Enter grams of fat: ");
        double agramsoffat = scnr.nextDouble();
        System.out.println("Enter grams of carbs: ");
        double agramsofcarbs = scnr.nextDouble();
        System.out.println("Enter grams of protein: ");
        double agramsofprotein = scnr.nextDouble();
        System.out.println("Enter number of servings: ");
        double numofservings = scnr.nextDouble();
        FoodItem oldItem = new FoodItem();
        FoodItem newItem = new FoodItem(afoodname, agramsoffat, agramsofcarbs, agramsofprotein);
        oldItem.printInfo();
        System.out.println("Number of calories for: " + numofservings + " servings: " +  oldItem.getcalories(numofservings));
        newItem.printInfo();
        System.out.println("Number of calories for: " + numofservings + " servings: " +  newItem.getcalories(numofservings)); 
    }
    
    public void printInfo(){
        System.out.println("Nutritional information per serving of " + foodname + ":");
        System.out.println("Fat: " + gramsoffat + " g");
        System.out.println("Carbohydrates: " + gramsofcarbs + " g");
        System.out.println("Protein: " + gramsofprotein + " g");
    }
}
