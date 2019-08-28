import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        NumberStatistics sumOfNumbers = new NumberStatistics();
        NumberStatistics sumOfEvens = new NumberStatistics();
        NumberStatistics sumOfOdds = new NumberStatistics();
        
        System.out.println("Type numbers: ");
        
        while (true) {
            int input = reader.nextInt();
            if (input != -1) {
                if (input % 2 == 0) {
                    sumOfEvens.addNumber(input);
                }else {
                    sumOfOdds.addNumber(input);
                }
                sumOfNumbers.addNumber(input);
            }else {
                break;
            }
        }
        System.out.println("sum: " + sumOfNumbers.sum());
        System.out.println("sum of even: " + sumOfEvens.sum());
        System.out.println("sum of odd: " + sumOfOdds.sum());
        
        
      }

// Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

    
}
