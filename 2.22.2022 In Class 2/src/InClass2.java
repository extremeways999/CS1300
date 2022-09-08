import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *3
 * @author eleph
 */
public class InClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userchannel;
        char channeltype;
        Scanner scnr = new Scanner(System.in);
        userchannel = scnr.nextInt();
        
        if((userchannel >=2) && (userchannel<=499)) {
            channeltype = 's';
    }
        else if ((userchannel>=1022)&&(userchannel<=1499)) {
                channeltype = 'h';
    }
        else {
                channeltype = 'e';
                }
        System.out.println(channeltype);
    }
    
}
