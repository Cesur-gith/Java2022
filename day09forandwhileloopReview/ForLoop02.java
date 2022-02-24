package day09forandwhileloopReview;

import java.util.Scanner;

public class ForLoop02 {

    public static void main(String[] args) {


        //1.Example: Put * between 2 consecutive characters and to the end in a String.
        // For example; Java ==> J*a*v*a*


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");

        String str = scan.nextLine();
/*

        for (int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + "*");
        }
        System.out.println("");
        System.out.println("===============================");
*/

        //2.Example: Type code to print unique characters in a String. Hello ==> Heo


        for (int k = 0; k< str.length(); k++ ){


            if (str.indexOf(str.charAt(k))==str.lastIndexOf(str.charAt(k))){



                System.out.print(str.charAt(k) + " ");
            }
        }

















        /*
        //1.Example: Put * between 2 consecutive characters and to the end in a string
        //For example;  Java ==> J*a*v*a*
        //               Ali ==> A*l*i*
        String s = "Ali";
        for(int i = 0       ;        i<s.length()     ;       i += 1 ){
            System.out.print( s.charAt(i) + "*");
        }
        System.out.println();
        System.out.println("==================");
        //2.Example: Type code to print unique characters in a string.
        // Hello ==> Heo
        //To be unique in a string means indexOf and lastIndexOf methods returns the same value
        //Note: The character should be exists
        String t = "Hello";
        for(int i = 0;        i<t.length();            i+=1 ){
            if(   t.indexOf(t.charAt(i) )    ==    t.lastIndexOf(t.charAt(i))   ){
                System.out.print(t.charAt(i));
            }
        }
        System.out.println();
        System.out.println("================");
        //3.Example: Type code to print a String in reverse after removing spaces
        //For example: "Ali Can" ==> "naCilA"
        String u = "Ali Can";
        String noSpace = u.replaceAll("\\s","");
        for(int i = noSpace.length()-1  ;   i>-1  ;  i-= 1  ){
            System.out.print(noSpace.charAt(i));
        }

*/





    }




    }
