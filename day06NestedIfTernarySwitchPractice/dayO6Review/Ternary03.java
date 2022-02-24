package day06NestedIfTernarySwitchPractice.dayO6Review;

import java.util.Scanner;

public class Ternary03 {


    public static void main(String[] args) {
         /*
           You have 2 integers;
           If both of the integers are postivive do multipication
           if one is negative the other one is positive return "i dont know how to multipy"
     */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number...");
        int num1 = scan.nextInt();

        System.out.println("Enter 2nd number");
        int num2 = scan.nextInt();

        // Ternary
        System.out.println((num1>=0 && num2>=0) ? (num1)*(num2) : "I dont know how to multiply" );

        // if-else
        if (num1>=0 && num2>=0){
            System.out.println(num1 * num2);
        }else {
            System.out.println("I dont know how to pultiply");
        }










    }

}
