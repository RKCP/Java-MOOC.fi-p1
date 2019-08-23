
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        int count = 1;
        int charCount = 0;
        
        while (charCount <= name.length()-1) {
            
            System.out.println(count + ". character: " + name.charAt(charCount));  
            count++;
            charCount++;
        }
        
    }
}
