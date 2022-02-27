package Practice04;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class Q07 {

    public static void main(String[] args) {


                    /*
             Remove duplicates from ArrayList.
             Logic:
             Create a new list, then transfer the elements
                          i) if they are not repeated
                          ii) if an element is repeated transfer it just once
                          [2, 3, 2, 2, 5] ==>  [2, 3, 5]
             */


       // int arr [] = {2, 3, 2, 2, 5};

        List <Integer>list1 = new ArrayList<>();

        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(2);
        list1.add(5);
        System.out.println(list1);

        List <Integer>list2 = new ArrayList<>(); // We have to cearte a new List to put the new numbers

        for (Integer w : list1) {
            if (!list2.contains(w)){
                list2.add(w);
            }
        }
        System.out.println(list2);




    }
}
