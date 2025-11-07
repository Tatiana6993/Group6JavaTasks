package Iskandarbek;

public class Task02_FinRa {
    public static void main(String[] args) {
// Call the finRaCheck method to process and print numbers from 1 to 20
        // using the FIN/RA/FINRA substitution rule.
        finRaCheck(1, 20);
    }

    /**
     * Processes a range of integers from 'start' to 'end' (inclusive) and prints:
     * - "FinRa" if the number is divisible by both 3 and 5 (i.e., divisible by 15),
     * - "Ra" if divisible only by 5,
     * - "Fin" if divisible only by 3,
     * - the number itself otherwise.
     * <p>
     * Output is printed on a single line, with each value followed by a comma and space.
     *
     * @param start the starting number of the range (inclusive)
     * @param end   the ending number of the range (inclusive)
     */
    public static void finRaCheck(int start, int end) {
        // Iterate through each integer in the given range
        for (int i = start; i <= end; i++) {
            // Check divisibility by 15 (LCM of 3 and 5) first to handle "FinRa"
            if (i % 15 == 0) {
                System.out.print("FinRa, ");
            }
            // Check divisibility by 5 for "Ra"
            else if (i % 5 == 0) {
                System.out.print("Ra, ");
            }
            // Check divisibility by 3 for "Fin"
            else if (i % 3 == 0) {
                System.out.print("Fin, ");
            }
            // If none of the above, print the number itself
            else {
                System.out.print(i + ", ");
            }
        }
        // Optional: Add a newline at the end for cleaner console output
        System.out.println();
    }
}

