package words;

public class Book {
    protected int pages = 1500; 
    //page mutator
        public void setPages (int numPages){
            pages = numPages; 
        }
        //pages accessor
            public int getPages(){
                return pages; 
            }
}
