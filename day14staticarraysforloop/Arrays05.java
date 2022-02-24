package day14staticarraysforloop;

import java.util.Arrays;

public class Arrays05 {


    // How to create an array and put element in it in one line

    public static void main(String[] args) {

        int a[] = {12, 7, 0, 32};  // you have already created which has 4 elements and use this one
        System.out.println(Arrays.toString(a));

        int b[] = {12, 7, 0, 32};
        System.out.println(Arrays.toString(b));

        // How to check if two arrays are same or not
        // Note: If two arrays have same elements at the indexes then arrays are same

        boolean areArraysSame = Arrays.equals(a, b);
        System.out.println(areArraysSame);

        // Type code to check if 2 arrays have same elements
        // use sort() method and then equal() method in if condition

        Arrays.sort(a);//[0,7,12,32]
        Arrays.sort(b);//[0,7,12,32]

        if (Arrays.equals(a, b)) {
            System.out.println("Same arrays");
        } else {
            System.out.println("Different arrays");
        }


        // Type code to check if a specific element exists in an array (If array is exist or not)

        int c[] = {-12, 21, 0, -2, 34};

        int num = 2;
        int counter = 0; // Flog is used to test if a part of code worked or not

        for (int w : c) {
            if (w == num) {
                counter++;
                break;

            }
        }

        if (counter ==0) {
            System.out.println(num + " does not exist");
        }else{
            System.out.println(num + " exists");
        }




    }



}