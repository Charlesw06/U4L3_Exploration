import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int input;
        int max = 0;
        int min = 0;
        int numCount = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (or -1 to quit): ");
        input = s.nextInt();

        if (input > max) {
            max = input;
        }
        if (input != -1) {
            min = input;
        }

        while (input != -1) {
            Scanner v = new Scanner(System.in);
            System.out.print("Enter a number (or -1 to quit): ");
            input = v.nextInt();

            if (input > max) {
                max = input;
            }
            if ((input < min) && (input != -1)) {
                min = input;
            }
            numCount++;
        }

        if (numCount != 0) {
            System.out.println("Max is: " + max);
            System.out.println("Min is: " + min);
        }
        else {
            System.out.println("You did not enter any numbers!");
        }
    }
}
