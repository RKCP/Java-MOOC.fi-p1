
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user

        int sum;

        System.out.print("Enter your number: ");
        int firstNum = reader.nextInt();
        System.out.print("Enter another number: ");
        int secondNum = reader.nextInt();

        sum = firstNum + secondNum;

        System.out.println("Sum of your numbers: " + sum);
    }
}
