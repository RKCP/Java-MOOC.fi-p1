
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Type another number: ");
        int secondNumber = reader.nextInt();

        double divide = (double) firstNumber/ secondNumber;

        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + divide);

        // Implement your program here. Remember to ask the input from user.
    }
}
