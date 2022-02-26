package day17multidimensionalarraylist;

import java.util.Arrays;

public class MultiDimensionalArray01 {


    // 1) If you use arrays as elements in an array then it is called "multidimensional array"



    // In an array you can store same element


    public static void main(String[] args) {

        // How to create multidimensional array

         int mda1 [][] = new int[3][2];


         // How to print the multidimensional array on the console

        System.out.println(Arrays.deepToString(mda1)); // [[0, 0], [0, 0], [0, 0]] == These are default value

        // How to assign values
        mda1 [0][1] = 9;
        System.out.println(Arrays.deepToString(mda1));

        mda1 [2][0] = 9;
        mda1 [0][0] = 11;
        mda1 [1][0] = 5;
        mda1 [1][1] = 4;
        mda1 [2][0] = 1;
        mda1 [2][1] = 21;
        System.out.println(Arrays.deepToString(mda1));

        // How to create multidimensional array in a short way
        // Mostly we use 2nd way
        int mda2[][] = {{2,3},{12},{21,34,54},{2}};
        System.out.println(Arrays.deepToString(mda2)); // [[2, 3], [12], [21, 34, 54], [2]]



        // How to print a specific inner array on the console

        System.out.println(Arrays.toString(mda2[2])); // [21, 34, 54]
        System.out.println(Arrays.toString(mda2[0])); // [2, 3]


        //How to find the number of elements in a multidimensional array. Example; [[2, 3], [12], [21, 34, 56], [4]] ==> 7

        int sum = 0; // In order to do addioton, you should use sum container

        for (int [] w : mda2) { // Syntex of forEachLoop

            sum = sum + w.length;


        }

        System.out.println(sum); //




    }
}
