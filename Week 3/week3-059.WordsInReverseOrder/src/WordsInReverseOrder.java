import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String wordEntered = reader.nextLine();
            
            if (wordEntered.isEmpty()) {
                System.out.println("You typed the following words: ");
                Collections.reverse(words);
                for (String word : words) {
                    System.out.println(word);
                }
                break;
            }else {
                words.add(wordEntered);
            }
        }
        
        
        
    }
}
