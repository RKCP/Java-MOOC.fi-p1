
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user

        System.out.print("Type a number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Type another number: ");
        int secondNumber = reader.nextInt();

        int biggerNumber = Math.max(firstNumber,secondNumber);

        System.out.println("The bigger number of the two numbers given was: " + biggerNumber);
    }
}
