package Practice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

/*
        Anagram is to create a new word from other word's characters.
                * Write java code to check if two words are anagram or not
                * isAnagram("listen", "Silent") ==> anagram
                * Dormitory = Dirty room
                * School master = The classroom
                * Conversation = Voices rant on
                * Listen = Silent
                * Astronomer = Moon starer*/

        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the first string");
        String first = scan.nextLine();
        System.out.println("Enter the second string");
        String second = scan.nextLine();

     //  isAnagram(first,second); // Call the method
        System.out.println(isAnagram(first,second));
    }

    // I should create a method outside the main method
    //          Make return type String
    public static String isAnagram (String str1, String str2){ // take the String and put them in the Array

        // here we converst the string to array.
        String s1 [] = str1.toLowerCase().replaceAll(" ", "").split("");
        String s2 [] = str1.toLowerCase().replaceAll(" ", "").split("");

        Arrays.sort(s1);
        Arrays.sort(s2);

        String isTrue = Arrays.equals(s1,s2) ? "Anagram" : "Not anagram";
        return isTrue;

 /*       if (Arrays.equals(s1,s2)){ // We check here these arrays are equal or not
            return "Anagram";
        }else{
            return "Not anagram";
        }*/
    }
}

 /*     static{
            // This is a static block
        }*/


/*

        List<String>list = new ArrayList<>();
        String str [] = {};
        int num [][] = {};
        int num1 [][] = new int[2][3];
*/
