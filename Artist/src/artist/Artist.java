/*Edwin Ly Homework 6 Artist Label 4/24/2022*/
package artist;
import java.util.Scanner;
public class Artist {
    private String artistname;
    private int birthyear;
    private int deathyear;
    Artist(){
        artistname = "None";
        birthyear = 0;
        deathyear = 0;
    }
    Artist (String artistname, int birthyear, int deathyear){
        this.artistname = artistname;
        this.birthyear = birthyear;
        this.deathyear = deathyear;
    }
        public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter an artist name: ");
        String arname = scnr.nextLine();
        System.out.print("Enter the artist's birth year: ");
        int artistbirthyear = scnr.nextInt();
        scnr.nextLine();
        System.out.print("Enter the artist's death year (or enter -1 if still alive): ");
        int artistdeathyear = scnr.nextInt();
        scnr.nextLine();
        System.out.print("Enter the title of the artist's artwork: ");
        String artworktitle = scnr.nextLine();
        System.out.print("Enter the year the artwork was created: ");
        int yearcreated = scnr.nextInt();
        Artist userArtist = new Artist (arname, artistbirthyear, artistdeathyear);
        Artwork newArtwork = new Artwork(artworktitle, yearcreated, userArtist);
        newArtwork.printInfo();}
        
        public void printInfo(){
        System.out.print("Artist: " + artistname);
        if (deathyear == -1){
            System.out.println(", born " + birthyear);    
        }
        else {
            System.out.println(" (" + birthyear + "-" + deathyear + ")");
        }
    }
}
