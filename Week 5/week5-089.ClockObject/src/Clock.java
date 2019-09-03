public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);
        
        this.hours.setValue(hoursAtBeginning);// set the 'value' from the BoundedCounter class to the int given here.
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    
    public void tick() {
        this.seconds.next();
        if (this.seconds.getValue() == 00) {
            this.minutes.next();
            if (this.minutes.getValue() == 00) {
                this.hours.next();
            }
        }
        
    }
    
    public String toString() {
        // returns the string representation
        return this.hours + ":" + minutes + ":" + seconds;
    }
}
