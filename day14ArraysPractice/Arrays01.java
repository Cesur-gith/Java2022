package day14ArraysPractice;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int myArr[] = {2,3,7,8,12,18};

        System.out.println(Arrays.toString(myArr));
        System.out.println(myArr[2]);
        System.out.println(myArr.length);

        int firstElement = myArr[0];
        System.out.println(firstElement); // give first element

        int lastElement = myArr[myArr.length-1]; // to have last element
        System.out.println(lastElement); // gives last element

        System.out.println(firstElement+lastElement);


        // Find the sum of all elements in an array

        int sum= 0;
        for (int i = 0; i < myArr.length; i++){

            sum = sum + myArr[i];
            System.out.println(sum);

        }


        int i = 0;
        int sum1 = 0;
        while (i<myArr.length){
            sum1 = sum1 + myArr[i];
            i++;
        }
        System.out.println(sum1);







/*
        int arr[] = {7,62,5,2,4,1};

        int firstElement = arr[0];
        System.out.println(firstElement);

        int lastElement = arr [arr.length-1];
        System.out.println(lastElement);

        System.out.println(firstElement+lastElement);
*/








    }





}
