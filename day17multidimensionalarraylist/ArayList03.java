package day17multidimensionalarraylist;

import java.util.ArrayList;
import java.util.List;

public class ArayList03 {

    public static void main(String[] args) {




        // Create a String ArrayList  and 5 elements into it, remove the eelements whose length are less than 5

        List<String> al7 = new ArrayList<String>();

        al7.add("Chirsian");
        al7.add("Alex");
        al7.add("Tommy");
        al7.add("Adriana");
        al7.add("Mary");
        System.out.println(al7); //  [Christian, Alex , Tommy, Adriana, Mary] == al7



        // Clone the al7 and use the cloned ArrayLists inside the loop.
        // How to clone a string in ArrayList

        List<String> clonedAl7 = new ArrayList<String>(al7); // clonedAl7 =  [Christian, Alex , Tommy, Adriana, Mary]

        for (String w: clonedAl7) { //clonedAl7 =  [Christian, Alex , Tommy, Adriana, Mary]

            if (w.length()<5){
                al7.remove(w);
            }
        }


        System.out.println(al7);
















    }
}
