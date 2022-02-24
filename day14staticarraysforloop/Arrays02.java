package day14staticarraysforloop;

import java.util.Arrays;

public class Arrays02 {

    // "w" is a reserved area for for-each-loop

    public static void main(String[] args) {

        //Create a String array and print the elements in alphabetical order on  the console in different lines

        //1 Step: Create a String array
        String myStringArray[] = new  String[4]; // [null null null null]
        System.out.println(Arrays.toString(myStringArray));

        // add element into the array

        myStringArray[0] = "Veli";
        myStringArray[1] = "Can";
        myStringArray[2] = "Beyhan";
        myStringArray[3] = "Ali";
        System.out.println(Arrays.toString(myStringArray));


        // How to put the elements in alphabetical order
        Arrays.sort(myStringArray);
        System.out.println(Arrays.toString(myStringArray));

        // How to print the elements in different lines
        for (String w : myStringArray){
            System.out.println(w);
        }

        // Print the list elements if the number of characters is less than 4

        for (String w: myStringArray) {//[Ali, Behyan, Can, Veli]

            if (w.length()<4){
                System.out.println(w);
            }

        }
        System.out.println("======================");
        // Print the list elements if you see "Can" stop printing

        for (String w: myStringArray) {

            if (w.equals("Can")){
                break;
            }


            System.out.println(w);
        }



        // Break - is used in switch statement to take out of the loop
        // and in loops to break the code



        System.out.println("=============");

        //Print the list elements except "Can" if there is. [Ali, Beyhan, Can, Veli]
        //1.Way:
        for(String w : myStringArray){
            if(!w.equals("Can")){
                System.out.println(w);
            }
        }

        //2.Way:
        for(String w : myStringArray){ // [Ali, Beyhan, Can, Veli]
            if(w.equals("Can")){
                continue; // Skips element/s under some conditions
            }
            System.out.println(w);
        }



    }





}
