
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //substring() removes the first x amount of letters from the word given.
        
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        
        System.out.print("Length of the first part: ");
        int lengthOfFirstPart = reader.nextInt();
        
        System.out.print("Result: " + word.substring(0, lengthOfFirstPart));
    }
}
