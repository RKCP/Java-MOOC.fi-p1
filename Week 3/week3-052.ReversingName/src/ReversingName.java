import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        String newName = "";
        int count = 0;
        
        while (newName.length() < name.length()) {
            count++;
            int charLength = name.length();        
            char nameChar = name.charAt(charLength - count);          
            
            newName += nameChar;
            
            System.out.println(newName);

        }
        System.out.print("In reverse order: " + newName);
        
    }
}
