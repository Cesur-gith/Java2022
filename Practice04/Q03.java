package Practice04;

import org.w3c.dom.css.Counter;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {
        /* Write code to find the sum of the dollars and sum of the euros in the given string   */

        String s = "$1 $12 €34 €56 $45 €78";

        // why we use split() here to cut the string and put each element to an array by using split() method
        String array [] = s.split(" "); // [$1, $12, €34, €56, $45, €78]
        System.out.println(Arrays.toString(array));
        int sumDollars = 0; // We need to create a container for adding. Reserved area
        int sumEuros = 0;

        for (String w : array) {
            if (w.contains("$")){           // convert int to string           //12
                   sumDollars = sumDollars + Integer.valueOf(w.replace("$", ""));
            }else{
                sumEuros = sumEuros + Integer.valueOf(w.replace("€", ""));
            }
        }

        System.out.println("The sum of dollars: " + sumDollars);
        System.out.println("The sum of euros: " + sumEuros);



        // To convert int to string
        // Type Casting
        int a = 123;
        String c = String.valueOf(a);
        System.out.println(c);





    }
}
