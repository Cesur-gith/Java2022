package day10ForLoopWhileLoopReview;

public class Q08Practice {

    public static void main(String[] args) {

                 /*
        Get the number of rows from user then draw a right triangle by using asterixs
        Number of rows = 4 ==>    *
                                  * *
                                  * * *
                                  * * * *
        */


        int num = 6;

        for (int i = 1; i < num ; i ++){

            for (int k = 1; k<i; k++){

                System.out.print("* ");

            }
            System.out.println();
        }


















    }
}
