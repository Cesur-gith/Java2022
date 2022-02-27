package Practice04;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
         /*
        Ask user to enter an integer, and create a squared multidimensional Array
        Example: If user enters 3 ==> [[3, 3, 3],[3, 3, 3],[3, 3, 3]]
                 If user enters 4 ==> [[4, 4, 4, 4], [4, 4, 4, 4], [4, 4, 4, 4], [4, 4, 4, 4]]
     */
 /*       Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int length = scan.nextInt(); // if user enters 2 [[2,2],[2,2]]
*/
        int length =3;

        if (length < 0 ){
            System.out.println("Hey user enter a positive integer");
        }else{
            int array [][] = new int[6][3];

            for (int i = 0; i < 6; i++){

                for (int j = 0; j< length; j++ ){

                    array [i] [j] = length;
                }
            }
            System.out.println(Arrays.deepToString(array));
        }



    }
}
