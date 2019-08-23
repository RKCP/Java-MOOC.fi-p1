
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String wordEntered = reader.nextLine();
            
            if (words.contains(wordEntered)) {
                System.out.println("You gave the word " + wordEntered + " twice");
                break;
            }else {
                words.add(wordEntered);
            }
        }
        
    }
}
