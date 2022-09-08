/*Edwin Ly Homework 6 Artist Label 4/24/2022*/
package artist;
public class Artwork {
    private String arttitle;
    private int yearCreated;
    private Artist artist;
    
    Artwork(){
        arttitle = "None";
        yearCreated = 0;
        artist = new Artist();
    }
    
    Artwork(String title, int yearCreated, Artist artist){
        this.arttitle = title;
        this.yearCreated = yearCreated;
        this.artist = artist;
    }
    public void printInfo() {
        artist.printInfo();
        System.out.println("Title: " + arttitle + ", " + yearCreated);
    }
}
