import java.util.Scanner;
public class InClass5 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numword;
        String currword;
        int i;
        int j;
        int frequency;
        String[] userword=new String[20];
        int[] wordfreq=new int[20];
        numword=scnr.nextInt();
        for(i=0;i<numword;++i){
            currword=scnr.next();
            userword[i]=currword;
        }
        for(i=0;i<numword;++i){
            frequency=0;
            for(j=0;j<numword;++j){
                if(userword[i].equals(userword[j])){
                    frequency=frequency+1;
                }
            }
            wordfreq[i]=frequency;
        }
        for(i=0;i<numword;i++){
            System.out.println(userword[i]+"  : "+wordfreq[i]);
        }
    }
}