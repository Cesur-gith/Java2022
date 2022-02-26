package day16ArraysPractice;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {



            //Please split this one into its letters
            String name = "Istanbul"; //[I,s,t,a,n,b,u,l]
            String arrName [] = name.split(""); // It should array
            System.out.println(Arrays.toString(arrName));

            //Please split this name into a char array.
            // Istanbul == It is with char [I, s, t, a, n, b, u, l]

            char array[] = name.toCharArray();
            System.out.println("It is with char " + Arrays.toString( array));






/*
















            String nameArray [] = name.split(""); //String

            System.out.println(Arrays.toString(nameArray));


            //Please split this name into a char array.
            char array [] = name.toCharArray();//char
            System.out.println("Char array => " + Arrays.toString(array));



*/

        }
}
