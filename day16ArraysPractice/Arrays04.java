package day16ArraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

    public static void main(String[] args) {

        //1)Get string from user and type code to find the number of words in a String.
        //2)Count how many words starts with "a".(Make code case-sensitive)

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a sentence");
        String str = scan.nextLine(); //Lets catch the string that is coming from user

        // I need to seperate the words So i need to use split()

        String array [] = str.split(" ");
        System.out.println(Arrays.toString(array));
        System.out.println("The number of words in the given sentence are: " + array.length);

        int counter = 0;
        for (String w : array ) {
            if (w.startsWith("a")){
                counter++;
            }
        }
        System.out.println("number of words that start with 'a' is: " + counter);


    }


}
