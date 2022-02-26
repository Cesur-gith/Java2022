package day16ArraysPractice;

import java.util.Arrays;

public class Arrays06 {


    public static void main(String[] args) {

    // Print the words ending with "y"
    // Make code case-insensetive

    String t = "Learn Java earn money.";
    t= t.replaceAll("\\p{Punct}", "");// To remove the punctuation  sembols

    String array [] = t.split(" ");
    System.out.println(Arrays.toString(array));

        for (String w : array) {
            if (w.endsWith("y") == w.endsWith("Y")){
                System.out.println(w + " ");
            }
        }








    }




}
