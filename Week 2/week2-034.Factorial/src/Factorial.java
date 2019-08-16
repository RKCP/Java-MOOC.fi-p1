import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int count = 1;
        int multiply = 1;

        System.out.print("Type a number: ");
        int num = reader.nextInt();

        while (count <= num) {

            multiply *= count;
            count++;

        }

        System.out.println("Factorial is " + multiply);

    }
}
