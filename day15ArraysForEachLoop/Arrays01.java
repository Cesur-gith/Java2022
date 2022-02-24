package day15ArraysForEachLoop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {

    public static void main(String[] args) {

        String srr [] = {"Veli", "Michael", "Ali", "Maria"};


        // Sort the array elements according to their lengths

        Arrays.sort(srr, Comparator.comparingInt(String::length));// why we choose this because we compare number of character
        // How can I get the number of character in Ali
        // After "comparingInt" choose String::length

        System.out.println(Arrays.toString(srr));


        // Sort the array elements in descending order according to their lengths == Start from longest character
        String trr [] = {"Veli", "Michael", "Ali", "Maria"};
        Arrays.sort(trr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(trr));

        // Sort the array elements in descending order according to their lengths == Start from longest character
        // If some elements are in the same length put them in alpabetical order
        String urr [] = {"Veli", "Michael", "Ali", "Maria", "Can", "Tan", "Ayse"};

        Arrays.sort(urr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));

        System.out.println(Arrays.toString(urr));




    }

}
