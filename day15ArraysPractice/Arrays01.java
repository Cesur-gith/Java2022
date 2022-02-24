package day15ArraysPractice;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {

    public static void main(String[] args) {



        //

        String srr [] = {"Veli","Michael","Ali ","Maria"};
        System.out.println(Arrays.toString(srr));

        Arrays.sort(srr, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(srr));


        // Sort the element acc to their length in descending order
        String trr [] = {"Veli","Michael","Ali ","Maria"};
        Arrays.sort(trr,Comparator.comparing(String::length).reversed());
        System.out.println(Arrays.toString(trr));



        String urr [] = {"Veli","Michael", "Can", "Ali ","Maria", "Ayse", "Tan"};


        //naturalOrder() means alphabetical order in Strings, ascending in numbers.
        Arrays.sort(urr, Comparator.comparing(String::length).reversed().thenComparing(Comparator.naturalOrder())); //Sorting then
        System.out.println(Arrays.toString(urr));




    }





}
