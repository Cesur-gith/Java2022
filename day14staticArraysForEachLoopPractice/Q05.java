package day14staticArraysForEachLoopPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {



    public static void main(String[] args) {

        /* Create an integer array by the help of user(ask user length and elements of array)
         * Ask user the index of element that user wants to remove.
         * Print the array on the console after removing
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int lenght = scan.nextInt();

        int arr []  = new int[lenght]; // empty array

        int i =0;

        do {
            System.out.println("Enter the element for index " + i);
            arr[i] = scan.nextInt();
            i++;


        }while (i<lenght);

        System.out.println(Arrays.toString(arr));

        System.out.println("Tell me the index of element which you want to remove");

        int idx = scan.nextInt(); // reserved area for removing the element

        if (idx < 0 || idx > arr.length-1){

            System.out.println("Invalid index..");

        }else {

            int newArr[] = new int[lenght-1];
            int b = 0;
            for (int k = 0; k<arr.length; k++ ){

                if (k==idx){
                    continue;
                }

                newArr[b] = arr[k];
                b++;
            }


            System.out.println("first array: " + Arrays.toString(arr));
            System.out.println("New array: " + Arrays.toString(newArr));




        }






    }



}
