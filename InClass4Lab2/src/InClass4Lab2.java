/*Edwin Ly Lab 2: Population Size*/

public class InClass4Lab2 {

    public static void main(String[] args) {
        String[] countries = {"USA", "China", "Russia", "Brazil", "Guatemala", "Norway", "England", "Italy", "Colombia", "Chile", "Mexico", "Canada"};
        int[] populations = new int[12];
        for(int i = 0; i<countries.length; i++){
            populations[i] = i*1000 + 1000;
        }
        for(int j = 0; j<countries.length; j++){
            System.out.println(countries[j] + " has a population of " + populations[j]); /*want to print out the country name and its population*/
        }
    }
}
