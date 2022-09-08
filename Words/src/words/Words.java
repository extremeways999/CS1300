package words;

public class Words {

    public static void main(String[] args) {
        //instantiate a derived class and invokes its inherited 
        Dictionary webster = new Dictionary();
        System.out.println("Number of pages: " + webster.getPages());
        System.out.println("Number of definitions: " + webster.getDefinition());
        System.out.println("Definition per page: " + webster.computeRatio());
    }
}
