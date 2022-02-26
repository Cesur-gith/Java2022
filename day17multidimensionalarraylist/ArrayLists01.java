package day17multidimensionalarraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    private static Object ArrayList;

    public static void main(String[] args) {

        /*
        * 1) When you create an array, you have to declare the length. Otherwise, you cant to create an array. So it is restriction
        * 2) After declaring the length it is impossible to store more elements in it, this is restriction
        * 3) Java created another structure to store multiple elements. It is ArrayLists.
        *
        *       ArrayLists are flexible in length. It means while creating ArrayLists, no need to declare the length.
        *       After creating ArrayList you may store any number of elements, there is any restriction about it.
        *       What is the differences btwn Array and ArrayLists.
        * 4)In array we can store primitive data types and its references but ArrayLists can store contains "non-primitive data types"
        *       Int ==> Array but Integer ==>ArrayLists
        *
        * Arrays are fixed with length but ArrayLists
        * Arrays store primitive data types but ArrayLists can store non primitive data and references
        *
        * */
        // When we create an array. We need to the declare like this


                // How to create an ArrayList
        //1st way
        ArrayList<Integer> al1 = new ArrayList<>();

        //2nd way
        ArrayList<Integer> al2 = new ArrayList<>();

        //3rd way. Use this one
        List<Integer> al3 = new ArrayList<>();


        // How to print an ArrayList on the console

        System.out.println(al1); // [] It is empty now because I did not put anything

        // How to add elements in to ArrayList

        al1.add(11);
        al1.add(12);
        al1.add(5);
        System.out.println(al1); // [] It is empty now because I did not put anything

        al1.add(1,99); //[11, 99, 12, 5]

        System.out.println(al1); // [] It is empty now because I did not put anything

        //How to get the number of elements in an ArrayList
        int numeOfElements = al1.size();
        System.out.println(numeOfElements);




        // String = length();
        // Array = length;
        // ArrayList = size();


        // How to check if an ArrayList is empty or not
        //1st way
        if (al1.size() == 0){
            System.out.println("It is empty");
        }else {
            System.out.println("It is not empty");
        }



        // 2.way
        if (al1.isEmpty()){ // You should learn it well
            System.out.println("It is empty");
        }else {
            System.out.println("It is not empty");
        }



        // How to check an ArrayList has a space in it. Space() method is used with String!!!
        List<String> al4 = new ArrayList<>();

         al4.add("a"); // [    ,  a ]
         al4.add(" "); // [    ]


        for (String w : al4) { // if 'w'
            if (w.equals(" ")){
                System.out.println("There is a space");
                break;
            }

        }
        System.out.println("====================================");

        // Create a String ArrayList, add 3 elements into it and remove the element whose length is less than 5

        List <String> str = new ArrayList<>();

        str.add("Apple");
        str.add("Kiwi");
        str.add("Watermelon");
        str.add("Tomato");
        str.add("Cherry");
        System.out.println(str);

        // How to remove an element by index
        // 'Object' means it is all non primitive data types

        str.remove("Apple"); // It will return boolean. True ==> mssion completed - false ==> could not remove
        System.out.println(str);


        // it will return the remove by indexelement to double-check
        str.remove(1);

        System.out.println("======================================");

        // Create an Integer ArayList, and 5 element into it, remove a specific element
        ArrayList<Integer> al6 = new ArrayList<>();

        al6.add(12);
        al6.add(13);
        al6.add(7);
        al6.add(32);
        al6.add(8);
        System.out.println(al6);

        // When you have Integers to remove, you have to use remove() method with index,
        // remove() method with element cant be used
        // Dont use remove() with integer element
        al6.remove(1);
        System.out.println(al6);


    }
}
