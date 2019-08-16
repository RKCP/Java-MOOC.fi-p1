
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int count = 0;

        System.out.print("First: ");
        int firstNum = reader.nextInt();

        System.out.print("Last: ");
        int lastNum = reader.nextInt();

        if (firstNum <= lastNum) {
            count += firstNum;
            while (count <= lastNum) {
                System.out.println(count);
                count++;
            }
        }
    }
}
