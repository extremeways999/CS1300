package words;
        
    public class Dictionary extends Book {
    private int definition=5200;
    //print a message using both local and inherited values
    
    public double computeRatio(){
        return definition/pages; 
    }
    //define mutator
    public void setDefinition(int numDefinitions){
        definition = numDefinitions;
    }
    //define accessor
    public int getDefinition(){
        return definition;
    }
}

