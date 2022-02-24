package day06NestedIfTernarySwitchPractice.dayO6Review;

import java.util.Scanner;

public class SwitchStatement03 {


    public static void main(String[] args) {


         /*
        Create a simple calculator which does addition, subtraction, multipication, division and percentage
        */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scan.nextInt();

        System.out.println("Enter second number");
        int secondNumber = scan.nextInt();

        System.out.println("Choose an operation among these ones.... ");


        char operation = scan.next().charAt(0);


        switch (operation){
            case '+' :
                System.out.println(firstNumber + secondNumber);
                break;
            case '-' :
                System.out.println(firstNumber - secondNumber);
                break;
            case '*' :
                System.out.println(firstNumber * secondNumber);
                break;
            case '/' :
                System.out.println(firstNumber / secondNumber);
                break;
            case '%' :
                System.out.println(firstNumber % secondNumber);
                break;
            default:
                System.out.println("Enter a requested input...");
                break;
        }


    }
}
