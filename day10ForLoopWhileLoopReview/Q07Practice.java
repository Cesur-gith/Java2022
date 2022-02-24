package day10ForLoopWhileLoopReview;

import java.util.Scanner;

public class Q07Practice {

    public static void main(String[] args) {

                    /*
             Print numbers from given number till the next multiple of 10. e.g.,
             if input is 5 it should print 5, 6, 7, 8, 9, 10 or
             if input is 27 it should print 27, 28, 29, 30 or
             if input is 40 then it should print 40.
             Use while loop..
            */

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an integer");

            int number = scan.nextInt();


            while (number % 10 != 0){
                System.out.print(number + " ");
                number++;
            }
             System.out.print(number);







    }
}
