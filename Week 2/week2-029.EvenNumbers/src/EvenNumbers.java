
public class EvenNumbers {

    public static void main(String[] args) {

        int count = 1;

        while (count < 101) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }
    }
}
