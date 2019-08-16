
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here

        System.out.print("Type your name: ");
        String user1Name = reader.nextLine();
        System.out.print("Type your age: ");
        int user1Age = reader.nextInt();

        System.out.println("");

        System.out.print("Type your name: ");
        String user2Name = reader.next();
        System.out.print("Type your age: ");
        int user2Age = reader.nextInt();



        int ageSum = user1Age + user2Age;

        System.out.println(user1Name + " and " + user2Name + " are " + ageSum + " years old in total.");
    }
}
