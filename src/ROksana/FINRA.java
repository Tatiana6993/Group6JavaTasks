package ROksana;

public class FINRA {
    public static void main(String[] args) {
        /*
        💻 Task 2, FINRA
Write a Java method that follows these rules:
*Print all numbers from 1 to 30.
*For numbers that are multiples of 3, print "FIN" instead of the number.
*For numbers that are multiples of 5, print "RA" instead of the number.
*For numbers that are multiples of both 3 and 5, print "FINRA" instead of the number.
         */
        finraOutput();
    }
    public static void finraOutput () {

        for (int i = 1; i <= 30; i++) {// parameters
            if (i % 3 == 0 && i % 5 == 0) {// condition
                System.out.print("FINRA");
            } else if (i % 3 == 0) {
                System.out.print("FIN");
            } else if (i % 5 == 0) {
                System.out.print("RA");
            } else {
                System.out.print(i);// int that is not divisible by either
            }
            System.out.print(" ");// for better visibility
        }
    }


}
