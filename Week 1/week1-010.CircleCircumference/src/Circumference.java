
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here

        System.out.print("Type the radius: ");
        int radius = reader.nextInt();
        double pi = Math.PI;
        double circumference = (double) 2 * radius * pi;

        System.out.println("Circumference of the circle: " + circumference);


    }
}
