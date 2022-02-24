package day14staticarraysforloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {

    // Create an Array by getting array elements from user

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements will you store inside the array? ");
        int len = scan.nextInt();

        String sArray[] = new String[len];
        System.out.println(Arrays.toString(sArray));

        for (int i = 0; i<len; i++){

            System.out.println("Enter a String..."); // If user enter a string, I should create a reserved area
            sArray[i]  = scan.next();


        }
        System.out.println(Arrays.toString(sArray));

    }

}
