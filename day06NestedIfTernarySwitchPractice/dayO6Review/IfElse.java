package day06NestedIfTernarySwitchPractice.dayO6Review;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

           /*
            A company decided to give bonus of 5% to employee if his/her year of
            service is 5 and more than 5 years.

            Ask user for their salary and year of service and print the net bonus amount.
            If employee can not get bonus, print how many more years he/she should work.

            EXAMPLE:
            INPUT   :   Year    => 4 year service
                        Salary  => 4000

            OUTPUT :  You need to work 1 year(s) to get bonus
             */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = scan.nextInt();

        System.out.println("Enter your service how many years your worked in this company?");
        int year = scan.nextInt();

        if (year >= 5 && salary==salary){
            System.out.println("You get a 5% bonus for working more than 5 and it will be granded next salary " + salary/100*5);
        }else{
            System.out.println( "You need to work " + ( 5 - year) + " more years");
        }









    }
}
