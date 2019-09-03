
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public int getValue() {
        return value;
    }
    
    public int getUpperLimit() {
        return upperLimit;
    }

    public void setValue(int value) {
        if (value < 0 || value > this.upperLimit) {
            
        }else {
            this.value = value;
        }
        
    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
        
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }
}
