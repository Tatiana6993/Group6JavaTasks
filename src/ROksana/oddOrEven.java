package ROksana;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        checkOddEven();

        check1OddEven(47);
        check1OddEven(10);

    }


    public static void checkOddEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number please: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        } else {
            System.err.println("Not valid input. Must be a number.");
        }

        scanner.close();
    }
        public static void check1OddEven(int number) {
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }



}
