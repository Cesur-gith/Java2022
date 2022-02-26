package day17multidimensionalarraylist;

import java.util.ArrayList;

public class ArrayList02 {

    public static void main(String[] args) {

        //Hot to remove a specific integer element from an integer list
        //1 Step = Create an Integer Wrapper Class Object by using the value which you want to remove

        ArrayList<Integer> al6 = new ArrayList<>();
        al6.add(12);
        al6.add(13);
        al6.add(7);
        al6.add(32);
        al6.add(8);
        System.out.println(al6);

        Integer el = Integer.valueOf(13);  // You need to use "Integer.valueOf"
        al6.remove(el);
        System.out.println(al6);




    }


}
