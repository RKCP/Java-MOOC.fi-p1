
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String reversedWord = "";
        String helperText = text;
        int textLength = text.length();
        

        
        while (reversedWord.length() < helperText.length()) {
            String lastLetter = text.substring((textLength - 1),textLength);
            textLength--;            
            reversedWord += lastLetter;

        }
        return reversedWord;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
