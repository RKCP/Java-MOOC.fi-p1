
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!

        int count = 0;

        while (true) {
            System.out.print("Guess a number: ");
            int userGuess = reader.nextInt();

            if (userGuess < numberDrawn) {
                System.out.print("The number is greater");
                count++;
                System.out.println(", guesses made: " + count);
            }else if (userGuess > numberDrawn) {
                System.out.print("The number is lesser");
                count++;
                System.out.println(", guesses made: " + count);
            }else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
