package Mariana.week1;

public class oddOrEvenTask {

    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(identify(5)); // Output: Odd
        System.out.println(identify(6)); // Output: Even
    }

     /*
    Write a method which can identify if a given number odd or even.
    Ex:
       Identify(5) --> "Odd"
       Identify(6) --> "Even"
     */
}
