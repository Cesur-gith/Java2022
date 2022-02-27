package Practice04;

import java.util.ArrayList;
import java.util.List;

public class Q09 {

    public static void main(String[] args) {

        /*
         * write a program to find the common elements between two String Arrays
         * (without case sensitivity)
         *
         * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         *
         * Output : [brad,sofia,emily]
         */

        String input1[] = { "John", "Brad", "Ange", "Sofia", "Emily" };
        String input2[] = { "sofia", "brad", "grace", "emily", "hazel" };

        List<String> output = new ArrayList<>(); // For common elements created a list.

        for (String w : input1){ // get each element from outer array input1

            for (String x: input2) { // get elements one by one from inner array input2

                if (x.equalsIgnoreCase(w)){
                    output.add(x);
                }
            }
        }
        System.out.println(output);
    }

}
