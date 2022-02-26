package day17multidimensionalarraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {

    public static void main(String[] args) {


        List<Integer> int1 = new ArrayList<>();

        int1.add(32);
        int1.add(22);
        int1.add(12);
        int1.add(4);
        int1.add(34);

        System.out.println(int1);

        System.out.println("==============================");

        List<Integer> int2 = new ArrayList<>();

        int2.add(98);
        int2.add(99);


        int1.addAll(int2); // Add list from another lists to actual list. It is for joining the Lists
        System.out.println(int1); // [32, 22, 12, 4, 34, 98, 99]

        System.out.println("==============================");


        int2.addAll(int1);
        System.out.println(int2); //[98, 99, 32, 22, 12, 4, 34, 98, 99]

        System.out.println("==============================");

        List<Integer> int3 = new ArrayList<>();

        int3.add(232);
        int3.add(432);


        int2.addAll(4,int3); // We can add in the middle of the Integer
        System.out.println(int2); // [98, 99, 32, 22, 232, 432, 12, 4, 34, 98, 99]

        System.out.println("==============================");

        // We can remove multiple element
        int2.removeAll(int1);
        System.out.println(int2); // [232, 432]

        System.out.println("==============================");

        boolean b = int1.contains(98);
        System.out.println("The number 98 exists" + b);

        System.out.println("==============================");

        int2.clear(); // remove all the element
        System.out.println(int2);
        System.out.println("==============================");

        System.out.println(int1);

        System.out.println("==============================");


        // Chnage the element les than 10 to 777
        for (Integer w : int1) {
            if (w < 10){
                int1.set(int1.indexOf(w),777); // indexOf () method gives me the index
            }
        }
        System.out.println(int1);

        System.out.println("==========================");

        // 2nd Way:
        for (int i = 0; i < int1.size(); i++){
            // get() is for getting index of element
            if (int1.get(i)<10){
                int1.set(i, 777);
            }
        }
        System.out.println(int1);
        System.out.println("==========================");


        ArrayList<String> sl1 = new ArrayList<>();
        sl1.add("Java");
        sl1.add("Lambda");

        ArrayList<String> sl2 = new ArrayList<>();
        sl2.add("Java");
        sl2.add("Lambda");

        boolean result = sl1.equals(sl2); // true
        System.out.println(result); // true


    }
}
