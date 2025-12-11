package Iskandarbek;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(frequencyOfChars(str));

    }


    public static String frequencyOfChars(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // skip if this character is already processed
            if (result.contains(ch + "")) {
                continue;
            }

            // resetting counter
            int count = 0;

            // count how many times ch appears in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // append char + count
            result += ch + "" + count;
        }

        return result;
    }
}
