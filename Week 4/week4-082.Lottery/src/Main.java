import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //create a new object of type/class LotteryNumbers 
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        
       //create an arrayList that holds integers, and assign it to the numbers method in the LotteryNumbers class
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        
        //get each number in the list and print it out
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
        System.out.println("Lottery numbers size is: " + numbers.size());
    }
}
