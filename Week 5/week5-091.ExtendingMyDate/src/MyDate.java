
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        this.day++;
        if (this.day == 31) {
            this.day = 1;
            this.month++;
            if (this.month == 13) {
                this.month = 1;
                this.year++;
            }
        }
        
    }
    
    public void advance(int numberOfDays) {
        for(int i = 0; i < numberOfDays; i++) {
            advance();
        }
    }
    
    //returns a new MyDate object
    //Has the date which equals the date of the object for which the method was called
    //advance this date by the parameter (int days)
    //Assume all months have 30 days
    //
    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);
        for(int i = 0; i < days; i++) {
            newMyDate.advance();
        }
        return newMyDate;
    }

}
