
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int count = 1;

        System.out.print("Up to what number? ");
        int userNumber = reader.nextInt();

        while (count <= userNumber) {
            System.out.println(count);
            count++;
        }

        
    }
}
