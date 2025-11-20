package Ala;

public class frequencyOfChars {

    public static void main(String[] args) {

        /*
        Write a return method that can find the frequency of characters in a given string.
        Example:
        frequencyOfChars("AAABBCDD")  ==>  A3B2C1D2

         */

        String input = "AAABBCDD";
        String result = frequencyOfChars(input);

        System.out.println(result);
    }

    public static String frequencyOfChars(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if (result.contains("" + ch)) {  // skip if character already counted
                continue;
            }

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            result += "" + ch + count;
        }

        return result;
    }

}
