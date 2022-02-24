package day10ForLoopWhileLoop;

import java.util.Scanner;

public class NestedForLoop02 {

    public static void main(String[] args) {

        /*

        Type code to get the output like
	Week: 1
	  Day: 1
	  Day: 2
	  Day: 3
	  .....
	Week: 2
	  Day: 1
	  Day: 2
	  Day: 3
	  ....
	Week: 3
	  Day: 1
	  Day: 2
	  Day: 3
	  ....
         */

        for (int i = 1; i<4; i++){

            System.out.println("Week" + i);


            for (int k = 1; k<4; k++){

                System.out.println("Day" + k);



            }
        }


        /*
        /*
    3 Example Write a Java Program to Print Rectangle Star Pattern using For Loop
        // Note : Get the numbers of row and columns from user

    ****
    ****
    ****
 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns");
        int columns = scan.nextInt();

         for (int i = 1; i<rows+1; i++){

             for (int k = 1; k<columns+1; k++){

                 System.out.print("*");
             }

             System.out.println();

         }
         
         
         
         
          /*
            6.Example: Type code to get the output like
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
         */


        System.out.println("Enter the number of rows");
        int a = scan.nextInt();
        System.out.println("Enter the number of columns");
        int b = scan.nextInt();

        for (int i = 1; i<a+1; i++){

            for (int k = 1; k<b+1; k--){

                System.out.print("1");
            }

            System.out.println();

        }




    }
}
