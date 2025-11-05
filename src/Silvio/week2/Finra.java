package Silvio.week2;

public class Finra {
    /* Task 2, FINRA.
    Write a Java method that follows these rules:
    Print all numbers from 1 to 30.
    For numbers that are multiples of 3, print "FIN" instead of the number.
    For numbers that are multiples of 5, print "RA" instead of the number.
    For numbers that are multiples of both 3 and 5, print "FINRA" instead of the number. */

    public static void main (String[] args){

        finra(1,30);

    }

    static void finra (int start, int end){

        for (int i = start; i <= end; i++){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " = FINRA");
            } else if (i % 3 == 0){
                System.out.println(i + " = FIN");
            } else if (i % 5 == 0){
                System.out.println(i + " = RA");
            } else {System.out.println(i);}
        }
    }
}