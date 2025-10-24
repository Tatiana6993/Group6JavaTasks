package Ala;

public class oddOrEven {

    public static void main(String[] args) {

        System.out.println("This is Ala");

        identify(5);
        identify(6);
    }

    public static void identify(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}








