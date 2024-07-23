package Loops;

public class breakAndContinue {
    public static void main(String[] args) {
        // break
        // break to exit a loop
        // Initially loop is set to run from 0-9
        for (int i = 0; i < 10; i++) {
            // terminate loop when i is 5.
            if (i == 5)
                break;

            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
        //Output:
//        i: 0
//        i: 1
//        i: 2
//        i: 3
//        i: 4
//        Loop complete.

        //continue
        for (int i = 0; i <= 15; i++) {

            // Check condition for continue
            if (i == 10 || i == 12) {

                // Using continue statement to skip the
                // execution of loop when i==10 or i==12
                continue;
            }
            // Printing elements to show continue statement
            System.out.print(i + " ");
        }
        //Output:
//        0 1 2 3 4 5 6 7 8 9 11 13 14 15
    }
}
