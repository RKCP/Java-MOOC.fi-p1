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
    
   public int differenceInYears(MyDate comparedDate) {
       int thisDateInDays = ((this.year - 1) * 365) + ((this.month - 1) * 30) + this.day;
       int comparedDateInDays = yearInDays(comparedDate) + monthInDays(comparedDate) + comparedDate.day;
       
       if (thisDateInDays > comparedDateInDays) {
           return (thisDateInDays - comparedDateInDays) / 365; // calculate the difference between the two dates (days amount) and divide the amount by 365. The integer given is the amount of years difference.
       }else {
           return (comparedDateInDays - thisDateInDays) / 365;
       }

       
   }
   
   public int monthInDays(MyDate givenDate) {
       return (givenDate.month - 1) * 30; // - 1 because we don't want to count the current month we are on.
   }
   
   public int yearInDays(MyDate givenDate) {
       return (givenDate.year - 1) * 365;
   }
        

}
