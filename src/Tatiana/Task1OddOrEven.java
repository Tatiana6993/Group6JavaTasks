package Tatiana;

public class Task1OddOrEven {
    public static void main(String[] args) {

        identifyNum(7);
        identifyNumber(11);

        identifyNumber(9);
        identifyNumber(23);



        //changed title

    }

    public static void identifyNum(int num){
        if (num / 2== 0){
            System.out.println("Even number");
        }else
            System.out.println("Odd number");
    }


    public static  void identifyNumber(int num1){
       String result = (num1 /2 == 0) ? "Even number" : "Odd number";
        System.out.println(result);
    }

       /*
    Write a method which can identify if a given number odd or even.
    Ex:
       Identify(5) --> "Odd"
       Identify(6) --> "Even"
     */
}




