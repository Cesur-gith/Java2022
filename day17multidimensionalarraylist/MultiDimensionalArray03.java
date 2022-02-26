package day17multidimensionalarraylist;

import java.util.Arrays;

public class MultiDimensionalArray03 {

    public static void main(String[] args) {

        // Converst arr1 to one dimensional array  { {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" };
        // To do it we need to cerate one dimensional array
        // then I need to get the first array elements and second array elements into new one dimensional array.

        String arr1[][] = { {"learn", "java", "it"}, {"is", "easy"} }; // This is a repeated action and use loop

        //Convert arr1 to one dimensional array. { {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }

        //Find the total number of elements in arr1
        int sum = 0;
        for(String[] w : arr1){
            sum = sum + w.length;
        }
        //Create a one-dimensional array whose length equals to the total number of elements in arr1
        String newArr[] = new String[sum]; // {null, null, null, null, null}

        //Transfer elements from arr1 to newArr
        int idx = 0;
        for(String[] w : arr1){ // { {"learn", "java", "it"}, {"is", "easy"} }
            for(String m : w){
                newArr[idx] = m; //{null, null, null, null, null}
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));


    }

}
