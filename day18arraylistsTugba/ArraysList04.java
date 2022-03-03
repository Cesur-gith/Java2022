package day18arraylistsTugba;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysList04 {

    public static void main(String[] args) {

    //Increase the value of every element by 3 except 7

    ArrayList<Integer> list = new ArrayList<>(); // ArrayList syntax
        list.add(11);
        list.add(15);
        list.add(10);
        list.add(7);
        list.add(9);

        Collections.sort(list);
        System.out.println(list);

        for (int i = 0; i< list.size(); i++) {

            // Skip method

            if (list.get(i) != 7) {
                continue;
            }
                list.set(i, list.get(i) + 3);
        }
        System.out.println(list);
    }
}
