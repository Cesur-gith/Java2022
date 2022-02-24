package day14staticarraysforloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int myArray[] = new int [5];

        // How to print an array on the console
        System.out.println(Arrays.toString(myArray)); // [0,0,0,0,0]

        // How to assign a value to a specific array element
        myArray[0] = 41;
        myArray[1] = 11;
        myArray[2] = 31;
        myArray[3] = 21;
        myArray[4] = 1;
        System.out.println(Arrays.toString(myArray));

        // How to print a specific element on the console
        System.out.println((myArray[2]));

        // How to get the number of elemens in an array
        // Note: We were using "length()" in the String Class but we use "length" in Arrays Class
        System.out.println(myArray.length); // 5

        // Print the sum of the first and the last element in an array on the console
        int firstElement = myArray[0];
        int idxOflastElement = myArray.length -1;
        int lastElement=myArray[idxOflastElement];
        System.out.println(firstElement+lastElement);


        // Find the sum of all elements in an array
        // 1st way
        int sum1 = Arrays.stream(myArray).sum();
        System.out.println(sum1);

        //2nd way Loop
        int sum = 0;
        for (int i =0; i<myArray.length; i++){
            sum = sum + myArray[i];
        }

        //2 way : use while-loop
        //3 way : use do-while-loop

        // 4 Way: Use for-each-loop. for-each-loop can be used collections
        // Get the sum of the array by using for-each-loop
        int sum2 = 0;
        for (int w : myArray){
            sum2 = sum2+w;
        }
        System.out.println(sum2);
    }

}
