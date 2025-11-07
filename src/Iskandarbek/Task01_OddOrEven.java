package Iskandarbek;

  /*
    Write a method which can identify if a given number odd or even.
    Ex:
       Identify(5) --> "Odd"
       Identify(6) --> "Even"
     */

public class Task01_OddOrEven {
    public static void main(String[] args) {

        // Test the oddOrEven method with an odd number
        oddOrEven(5);   // expected output: odd

        // Test the oddOrEven method with an even number
        oddOrEven(6);   // expected output: even

    }

    /**
     * Determines whether a given integer is odd or even and prints the result.
     *
     * @param num the integer to be checked
     */
    public static void oddOrEven(int num) {
        // Check if the number is divisible by 2 (i.e., has no remainder)
        if (num % 2 == 0) {
            // If remainder is 0, the number is even
            System.out.println(num + " is even number");
        } else {
            // Otherwise, the number is odd
            System.out.println(num + " is odd number");
        }
    }

}
