package day06NestedIfTernarySwitchPractice.dayO6Review;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args) {


        //Type code to calculate the absolute value of a number
        //For positive numbers and zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by -1

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to calculate");
        int number = scan.nextInt();

        if (number>0){
            System.out.println(number);
        }else{
            System.out.println(number * (-1));
        }













    }

}
