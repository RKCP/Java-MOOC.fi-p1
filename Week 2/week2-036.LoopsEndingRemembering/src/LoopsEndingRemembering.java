import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int numberCount = 0;
        double average = 0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Type numbers:");

        while (true) {
            int enteredNumber = reader.nextInt();

            if (enteredNumber % 2 == 0) {
                evenCount++;
            }else {
                oddCount++;
            }

            if (enteredNumber == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            sum += enteredNumber;
            numberCount++;
            average = (double) sum / numberCount;
        }

        oddCount -= 1; // could just do int oddCount = numberCount - evenCount;

        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numberCount);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);


    }
}
