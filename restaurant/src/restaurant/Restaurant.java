package restaurant;

public class Restaurant {
    
    private String name;
        private int rating; 
        public void setName(String restaurantname){ //mutator: set a value
            name = restaurantname; 
        }
        
        public void setRating(int userRating){ //mutator: set a value 
        rating = userRating;
    }
        public String getName(){ //accessor
            return name;
        }
        public int getRating(){ //accessor
            return rating; 
        }
        
    public void print(){
        System.out.println(name + "------" + rating); 
    }
    
    public static void main(String[] args) {
        Restaurant favdinnerplace = new Restaurant(); /*creating new dinner object*/
        Restaurant favlunchplace = new Restaurant(); /*creating new lunch object*/
        favdinnerplace.setName("Central Deli");
        favdinnerplace.setRating(10);
        favlunchplace.setName("Subway");
        favlunchplace.setRating(21);
        System.out.println("My favorite places: ");
        favdinnerplace.print();
        favlunchplace.print();
    }
}
