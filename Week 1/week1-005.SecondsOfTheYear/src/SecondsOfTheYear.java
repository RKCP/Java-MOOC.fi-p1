public class SecondsOfTheYear {

    public static void main(String[] args) {   
        // In below an incomplete version of the program. Please complete it!
        
        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        int minutesInADay = minutesInHour * hoursInDay;
        int secondsInADay = secondsInMinute * minutesInADay;
        int secondsInYear = daysInYear * secondsInADay;

        System.out.println("There are " + secondsInYear + " seconds in a year");
    }

}
