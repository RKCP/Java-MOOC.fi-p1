import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int firstNum = reader.nextInt();
        System.out.print("Type the second number: ");
        int secondNum = reader.nextInt();

        if (firstNum > secondNum) {
            System.out.println("Greater number: " + firstNum);
        }else if (secondNum > firstNum) {
            System.out.println("Greater number: " + secondNum);
        }else {
            System.out.println("The numbers are equal!");
        }

    }
}
