/*Edwin Ly Lab 1: Middle Item*/

public class InClass4Lab1 {

    public static void main(String[] args) {
        int[] first_array = {2,3,4,8,11,-1}; /*find the median, not including negatives.*/
        
        if(first_array.length>9){
            System.out.println("Too many numbers.");
        }
        else {
            System.out.println("Middle item: " + first_array[(first_array.length/2)-1]); /*want to find the median, disregard the last number*/ 
        }   
    }
}
