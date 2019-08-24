
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        System.out.print("seconds: "); // read the initial value of s/m/h from the user... READ THE VALUE FROM THE USER. 
        int s = reader.nextInt();
        System.out.print("minutes: ");
        int m = reader.nextInt();
        System.out.print("hours: ");
        int h = reader.nextInt();


        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        

        


            

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes + ":" + seconds);
            seconds.next();
            if (seconds.getValue() == 00) {
                minutes.next();
                if (minutes.getValue() == 00) {
                    hours.next();
                }
            }

            i++;
        }

    }
}


        //* If you want to run it like a real clock use this inplace of the above *//

//        seconds.setValue(50);
//        minutes.setValue(59);
//        hours.setValue(23);

//        while ( true ) {
//            System.out.println( hours + ":" + minutes + ":" + seconds );
//            Thread.sleep(1000);
//            // put here the logic to advance your clock by one second
//        }
