
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        while (true) {
            System.out.print("Please enter a floating number: ");
            double value = Double.parseDouble(reader.nextLine()); //takes in a String and converts it to a double.

            if(value >= -30.0 && value <= 40.0) { // must be && and not || because with the ||, if you put -31 it will still go through as -31 is less than 40. Same as if you put 42, it would go through as 42 is greater than -30.
                Graph.addNumber(value);
                System.out.println("Adding number to graph.");
            }

//            System.out.print("Would you like to enter another number?: ");
//            String answer = reader.nextLine();
//            if (answer.equals("no")) {
//                break;
//            }

        }
    }
}
