
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        System.out.print("Type a number: ");
        int inputNum = reader.nextInt();

        while (count <= inputNum) {
            int result = (int)Math.pow(2, count);
            sum += result;
            count++;
        }




        System.out.println("The result is " + sum);


    }
}
