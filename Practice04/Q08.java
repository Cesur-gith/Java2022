package Practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q08 {

    public static void main(String[] args) {

                          /*
            A list has elements "M", "K" and "P"
            Ask user to enter a letter
            If the letter exists in list convert it to "Got it"
            otherwise list will stay same
            */




        List<String> list = new ArrayList<>();
        list.add("M");
        list.add("K");
        list.add("P");
        System.out.println(list);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter");
        String letter = scan.next().toUpperCase();

            if (list.contains(letter)){
                list.set(list.indexOf(letter), "Got it"); // I can update the element list.
            }else {
                list.add(letter);
            }
        System.out.println(list);

        }



    }



