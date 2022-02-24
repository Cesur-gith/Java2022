package day14ArraysPractice;

import java.util.Arrays;

public class Arrays02 {
    //Create a String array and print the elements in alphabetical order on  the console in different lines

    public static void main(String[] args) {


        String myString[] = {"Ali", "Veli", "Can", "Ahmet"};

        Arrays.sort(myString);

        System.out.println(Arrays.toString(myString));


    }



}
