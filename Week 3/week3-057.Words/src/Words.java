import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);     
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            
            if (word.isEmpty()) {
                System.out.println("You typed the following words: ");
                for (String wordToPrint:words) {
                    System.out.println(wordToPrint); //print each word in the list on an individual line
                }
                break;
            }else {
                words.add(word);
            }
        }
        
        
        
        
    }
}
