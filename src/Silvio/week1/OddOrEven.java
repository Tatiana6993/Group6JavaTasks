package Silvio.week1;

public class OddOrEven {

    public static void main(String[] args){
        oddOrEven(2);
    }

    static void oddOrEven(int num){
        if(num % 2 == 0){
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
