package day10ForLoopWhileLoopReview;

import java.util.Locale;
import java.util.Scanner;

public class Q04Practice {

    public static void main(String[] args) {

               /*
         Ask user to enter a name and a character,
         then check how many times the character is repeated
         in the name by using for loop(make code case-sensitive)
        Example:
        INPUT      :char ch1= 'a' ;
                    String name =“John came late";
        OUTPUT :  a is repeated 2 times in this String
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character to find the frequency of it");

        String str = scan.nextLine().toLowerCase();
        System.out.println("Enter a character, If you enter more than one character, I can just check the first");

        char c = scan.next().charAt(0);

        int counter = 0;
        for (int i = 0; i < str.length(); i ++  ){

            if (c==str.charAt(i)) {         // this is to find the frequency of a character.
                counter++;                  // this is count the character frequency after finding and sent to counter  reserved area above
            }

        }

        System.out.println(c+ " is repeated " + counter + " times in a string");

    }

}
