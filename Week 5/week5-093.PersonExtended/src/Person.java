import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name) {
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
    }
    
    
    public int age() {
        MyDate currentDate = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));

        int birthdayInYears = birthday.differenceInYears(currentDate);
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        return birthdayInYears;
    }
    
    public boolean olderThan(Person compared) {
        if (this.age() > compared.age()) { // if the person this method is called on is older, return true.
            return true;
        }else if(this.age() == compared.age()){ // if the person this method is called on is the same age as the compared person, check if their birth date is earlier than the compared birth date.
            if (this.birthday.earlier(compared.birthday)) { // if it is earlier, return true, else return false.
                return true;
            } return false;
        }else { // if the person this method is called on is not older, return false.
            return false;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
