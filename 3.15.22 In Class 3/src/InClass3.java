import java.util.Scanner; //enhanced for loop

public class InClass3 {

    public static void main(String[] args) {
        String[] teamRoster = new String[3];
        
        teamRoster[0] = "Mike";
        teamRoster[1] = "Scottie"; 
        teamRoster[2] = "Toni";
        
        System.out.println("Current roster: ");
        for(String playerName : teamRoster){ /*can make the variable any name, but the datatype must be the same as the data type you want */
            System.out.println(playerName);
        }
    }
    
}
