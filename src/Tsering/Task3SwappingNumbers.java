package Tsering;

public class Task3SwappingNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        swap(a,b);
        }

        public static void swap(int a, int b) {

            System.out.println("Before swapping: a = " + a + ", b = " + b);

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swapping: a = " + a + ", b = " + b);



    }
}
