package day06NestedIfTernarySwitchPractice.dayO6Review;

import java.util.Scanner;

public class SwitchStatement01 {

    public static void main(String[] args) {

          /*
        Get the numbers of the day from user and print the name of the day
        For example; 1 = Sunday, 2 = Monday etc.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of the day");
        int numberOfDay = scan.nextInt();



        switch (numberOfDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueaday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a number between 1-7 to get the name of the day please ");
        }



    }

}
