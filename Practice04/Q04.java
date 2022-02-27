package Practice04;

import org.w3c.dom.ls.LSOutput;

public class Q04 {


    public static void main(String[] args) {

        /*
         * Create a method that can add the even numbers in the array
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         * OUTPUT : The sum of even numbers is  : 30
         */

        int array [] [] = { {1,3,6},    {2,8},     {5,7,9,14}};
        int brr [] [] = {{1,3,8},{6,8},{5,12,9,14}};

        sumOfEvent(array);
        sumOfEvent(brr);
    }
    public static void sumOfEvent(int array[] [] ){  // we use void so it should be syso not return
        int sum = 0; //6 + 2 + 8  + 14 = 30

            // take the 1st element as whole

              // 0, 1, 2
        for (int w [] : array) {  // { {1,3,6},    {2,8},     {5,7,9,14}};   // For the first element we should use array

            for ( int m : w) {  // {1,3,6}   {2,8},   {5,7,9,14}};            // for the second for loop is integer

                if (m % 2 == 0){
                    sum = sum +m;
                }
            }
        }
        System.out.println(sum);
    }
}
