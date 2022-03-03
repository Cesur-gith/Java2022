package day18arraylistsTugba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysList02 {

    public static void main(String[] args) {
                /*
        Ask user to enter a letter
        If the letter exists in the list convert it to "Got it"
        otherwise, add the element user entered into the list
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter please");
        String letter = scan.next().toUpperCase(); // Using string is better always in order to char

        String array [] = {"J", "A", "V", "A"};

        for (int i = 0; i < array.length; i++){

            if (letter.equals(array[i])){
                array[i] = "Got it";
            }
        }
        System.out.println(Arrays.toString(array));

        System.out.println("=====================");

        ArrayList<String> list = new ArrayList<>(); // ArrayList syntax

        list.add("J");
        list.add("A");
        list.add("V");      //V  = 2
        list.add("A");


        if (list.contains(letter)){
            //set() work with two parameters 1st one is exists that we want to updet(index) and 2nd one is that we wan tto put
            list.set(list.indexOf(letter), "Got it!"); // set (update) method at specific index. We change the index with new input

            list.set(3, "Done");    // Suraya sonradan degistirdik
            System.out.println(list);

        }else {
            list.add(letter);
            System.out.println(list);

    }
}
}
