
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        System.out.print("Until what? ");
        int untilNumber = reader.nextInt();

        while (count <= untilNumber) {
            sum += count;
            count++;
        }

        System.out.println("Sum is " + sum);


    }
}
