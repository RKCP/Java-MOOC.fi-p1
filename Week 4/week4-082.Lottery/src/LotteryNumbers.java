import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        //start with a fresh ArrayList
        this.numbers = new ArrayList<Integer>();
        
        //define the range
        int max = 39;
        int min = 1;
        int range = max - min + 1;
        int count = 0;
        
        //generate 7 random numbers within 1 to 39
        while (count < 7) { //or while (this.numbers.size() < 7) {
            
            int randomNumber = (int) (Math.random() * range) + min; //could have just imported Random, made a new random object and used random.nextInt(39) + 1 (the +1 to ensure that its never 0;
            //ensure the number isn't already in the list and add it
            if (!containsNumber(randomNumber)) {
                this.numbers.add(randomNumber);
                count++;
            }
            
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }else {
            return false;
        }
    }
}
