
public class NumberStatistics {
    
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }
    
    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.sum += number;
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        if (this.amountOfNumbers != 0) {
            return this.sum;
        }else {
            return 0;
        }
        
    }

    public double average() {
        if (this.amountOfNumbers != 0) {
            return (double) this.sum / this.amountOfNumbers;
        }else {
            return 0;
        }
        
    }
}
