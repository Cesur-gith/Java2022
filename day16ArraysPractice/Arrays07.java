package day16ArraysPractice;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays07 {


    public static void main(String[] args) {

        // Find the longest word in string with the help of array.
        //

        String s = "Ali can went to school to learn";
        String array [] = s.split(" ");  // Seperate the sentence to find it easily
                System.out.println(Arrays.toString(array)); // [Ali, can, went, to, school, to, learn]

        Arrays.sort(array, Comparator.comparingInt(String::length)); // it is ordered according to their length according to the ascending order
        System.out.println(Arrays.toString(array)); // [to, to, Ali, can, went, learn, school]


        System.out.println("The longest word is: " + array[array.length-1]); //  school
        System.out.println("The longest word is: " + array[0]); //to
















    }
}
