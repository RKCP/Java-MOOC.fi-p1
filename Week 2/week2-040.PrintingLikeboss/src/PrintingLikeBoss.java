public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int count = 0;
        while (count < amount) {
            System.out.print("*");
            count++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int count = 0;

        while (count < amount) {
            System.out.print(" ");
            count++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int count = 1;

        while (count <= size) {
            printWhitespaces(size - count);
            printStars(count);
            count++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int count = 1;
        int space = height-1;
        int i = 0; // need this extra variable to run the while loop with as count will surpass height really quickly in this loop.

        while (i < height) {
            printWhitespaces(space); //loop1 prints out 9 spaces. //loop2 prints out 8 spaces.
            printStars(count); //loop1 prints out 1 star. //loop2 prints out 3 stars.
            space--; //loop1 reduces space to 8. //loop2 reduces space to 7.
            count += 2; //loop1 increases count to 3. //loop2 increases count to 5.
            i++; //loop1 increases i to 1. //loop2 increases i to 2.
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

//        printTriangle(5);
//        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
