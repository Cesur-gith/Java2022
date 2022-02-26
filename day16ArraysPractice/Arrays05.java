package day16ArraysPractice;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

        // Find the vowels in a String by using arrays

        String str = "Learn Java ear money";

        String strArray [] = str.split("");  // Put the the sentence into array
        System.out.println(Arrays.toString(strArray));

        int counter = 0;

        for (String w : strArray) {
              if (w.equalsIgnoreCase("a") ||w.equalsIgnoreCase("e") || w.equalsIgnoreCase("i")
                      ||w.equalsIgnoreCase("o") ||w.equalsIgnoreCase("u")){

                  System.out.print(w + " ");
                  counter++;
              }
        }

        System.out.println();

        System.out.println("The number of vowels are: " + counter);
    }
}
