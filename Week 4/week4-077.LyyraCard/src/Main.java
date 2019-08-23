
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Creates a LyyraCard for Pekka with initial balance of 20 euros
        LyyraCard cardPekka = new LyyraCard(20);
//        Creates a LyyraCard for Brian with initial balance of 30 euros
        LyyraCard cardBrian = new LyyraCard(30);

//        Pekka buys gourmet lunch
        cardPekka.payGourmet();
        
//        Brian buys economical lunch
        cardBrian.payEconomical();
        
//        cards are printed (both on their own row, starting with the name of the card owner)        
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);    
        
//        Pekka loads 20 euros
        cardPekka.loadMoney(20);

//        Brian buys gourmet lunch
        cardBrian.payGourmet();

//        cards are printed (both on their own row, starting with the name of the card owner)
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

//        Pekka buys economical lunch
        cardPekka.payEconomical();


//        Pekka buys economical lunch
        cardPekka.payEconomical();

//        Brian loads 50 euros
        cardBrian.loadMoney(50);

//        cards are printed (both on their own row, starting with the name of the card owner)
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);


        
        


        

        

        

        

        

        
    }
}
