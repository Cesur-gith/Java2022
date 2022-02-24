package day07stringmanipulationReview;

import java.util.Locale;
import java.util.Scanner;

public class Sm01 {


            public static void main(String[] args) {

                //3.Example: Check if any character exists in a String or not

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a word");
                String str = scan.nextLine().toLowerCase();

                if (str.contains("a")){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }










/*

                //2.Example: Type code to get initials of the first name and the last name of a given name.
                // Ali Can ==> AC, Mary Star ==> MS etc.


                // Jasur Firat  ==== JF
               String firstLetterOfFirstName =  str.substring(0,1);
                int firstLetterOfLastName = str.indexOf(" ")+1;
                String firstCharOfLastName = str.substring(firstLetterOfLastName, firstLetterOfLastName+1);
                System.out.println(firstLetterOfFirstName + firstCharOfLastName);

                // Write the 2nd letter of first name
                int a = str.indexOf("")+1;
                String stra = str.substring(a, a+1);
                System.out.println(stra);
*/


                //1.Example: Print the first and last character of the given String on the console. "Java is easy" ==> Jy
                //To get characters from a String one by one we have 2 ways;
                //1.Way: Using charAt();
                //If you use '0' inside the charAt() method you will get first character in a String



//                1st way using chatAt() method

             /*   char firstchar = str.charAt(0);
                char lastchar =str.charAt(str.length()-1);
                System.out.println("" + firstchar + lastchar);*/

//               2nd way with substring () method
          /*      String  firstletter = str.substring(0,1);
                String lastLetter = str.substring(str.length()-1);
                System.out.println(firstletter + lastLetter);*/





















/*



                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter a word");
                String str = scan.nextLine();
                //First way
                String firstLetter = str.substring(0 ,1);
                String lastLetter = str.substring(str.length()-1);
                System.out.println(firstLetter + lastLetter);


                //2nd Way
                char firstLetter1 = str.charAt(0);
                System.out.print(firstLetter1);

                char lastLetter2 = str.charAt(str.length()-1);
                System.out.print(lastLetter2);

                //2.Example: Type code to get initials of the first name and the last name of a given name. Ali Can ==> AC, Mary Star ==> MS etc.


                System.out.println("Enter your name...");
                String name = scan.nextLine();

                String first = name.substring(0,1);
                System.out.print(first);
                String second = name.substring(name.length()-1);
                System.out.print(second);





*/






















                /*
                    //1.Example: Print the first and last character of the given String on the console
                    //"Java is easy" ==> Jy
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter a String..");
                    String str = scan.nextLine();
                    //1.Way:Using charAt() method
                    char firstChar = str.charAt(0);
                    //If you use "str.length()-1" inside the charAt() method you will get the last character in a String
                    char lastChar = str.charAt(str.length()-1);
                    System.out.println(""+firstChar + lastChar);
                    //2.Way:Using substring() method,
                    //str.substring(a,b) means starting from a. index until b. index. Do not forget a is inclusive b is exclusive
                    String firstCharacter = str.substring(0,1);
//        String lastCharacter = str.substring(str.length()-1);
                    String lastCharacter = str.substring(str.length()-1 , str.length());
                    System.out.println(firstCharacter+lastCharacter);
                    //2.Example : Type a code to get initials of first name and the last name of a give name.(please enter just first and last name)
                    //Ali Can ==> AC, Mary Star == MS
                    String initialOfFirstName = str.substring(0,1);
                    //how to find index of last name
                    //1)Find the index of space. str.indexOf(" ")==> gives us index os space
                    //2)increase the index of space by 1 then you will be able to find the index of last name.
                    int indexOfInitialOfLastName = str.indexOf(" ") + 1;
                    String initialOfLastName = str.substring(indexOfInitialOfLastName,indexOfInitialOfLastName+1);
                    System.out.println(initialOfFirstName + initialOfLastName);
                    //3.Example: Check if any character exists in a String or not
                    //1:way:
                    String characterToCheck = "X";
                    int result =str.indexOf(characterToCheck);
                    System.out.println(result);
                    if(result==-1){
                        System.out.println("The character does not exists..");
                    } else {
                        System.out.println("The character exists..");
                    }
                    //2.Way:
                    //Java created contains() method to check if a spesific character exists in a string or not
                    boolean isContain = str.contains("X");
                    if(isContain){
                        System.out.println("The character exists in the string");
                    } else {
                        System.out.println("The character does not exists..");
                    }
        /*
        The methods we learned so far:
        1) equals()
        2)equalsIgnoreCase()
        3)length()
        4)toUpperCase
        5)toLowerCase
        6)contains
        7)charAt()
        8)indexOf
        9)substring(with 1 index)
        10)substring(with 2 indexes)
         */




            }
}