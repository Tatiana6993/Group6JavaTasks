package Ala;

public class oddOrEven {

    public static void main(String[] args) {


        identifyNum(5);
        identifyNum(6);

        identifyNum1(10);
        identifyNum1(23);

    }

    public static void identifyNum(int num) {
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else
            System.out.println("Odd number");

    }

    public static void identifyNum1(int num1) {
        String result = (num1 % 2 == 0) ? "Even number" : "Odd number";
        System.out.println(result);
    }
}

       /*
    Write a method which can identify if a given number odd or even.
    Ex:
       Identify(5) --> "Odd"
       Identify(6) --> "Even"
     */












