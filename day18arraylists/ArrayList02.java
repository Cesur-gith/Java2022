package day18arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter...");
        String letter = scan.next();

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("K");
        list.add("R");
        list.add("S");

        if (list.contains(letter)) {
            list.set(list.indexOf(letter), "Got it");
        } else {
            list.add(letter);
        }

        System.out.println(list);
    }
}