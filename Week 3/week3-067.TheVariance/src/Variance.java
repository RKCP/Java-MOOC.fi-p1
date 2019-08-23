import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        
        for (int num: list) {
            sum+= num;
        }
        
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int sum = sum(list);
        int listSize = list.size();
        double average = (double) sum / listSize;
        
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double sumOfPows = 0;
        double average = average(list);
        double variance = 0;
        
        for (int i: list) {
            double numToPow = i - average;
            double pow = Math.pow(numToPow, 2);
            sumOfPows += pow;
            System.out.println("Pow is: " + pow);
            System.out.println("sumOfPows is: " + sumOfPows);
            variance = (double) sumOfPows / (list.size() - 1); // need brackets around the list.size()-1 or it will divide sumOfPows by list.size, and then minus 1 from the result.
        }
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        
//        list.add(3);
//        list.add(2);
//        list.add(7);
//        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
