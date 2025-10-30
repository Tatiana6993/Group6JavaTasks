package Paola;

public class oddOrEven {
    public static void main(String[] args) {

        int userInput = 't';

        String result = isOddOrEven(userInput);
        System.out.println(result);

    }

    public static String isOddOrEven(int num) {

        if (!Character.isLetter(num)) {
            if (num % 2 == 0) {
                return num + " is an even number";
            } else {
                return num + " is an odd number";
            }
        } else {
            return "Invalid number";
        }
    }


}