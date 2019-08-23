public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        initialValue = this.value; // stored the value set when the constructor is called, as the value for this field. Will not change as it is only set here.
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if (this.value > 0) {
            this.value--;
        }
    }
    
    public void reset() {
        this.value = 0;
    }
    
    public void setInitial() {
        this.value = this.initialValue;
    }
}
