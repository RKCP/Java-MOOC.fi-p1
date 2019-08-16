
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;

        System.out.print("First: ");
        int firstNum = reader.nextInt();

        System.out.println("Last: ");
        int lastNum = reader.nextInt();

        int count = firstNum;

        while (count <= lastNum) {

            sum+= count;
            count++;
        }

        System.out.println("The sum is " + sum);
    }
}
