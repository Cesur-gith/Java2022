package day06NestedIfTernarySwitchPractice.dayO6Review;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

        // write a code to find a number is even or odd

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please");

        int number = scan.nextInt();

        if (number%2==0){
            System.out.println("Your number is even " + number);
        }else{
            System.out.println("Your number is odd " + number);
        }



    }

}
