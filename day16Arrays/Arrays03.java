package day16Arrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

                       /*
                Please split the dates and get day, month and the year separately on the console
                day
                month
                year
                 */

        String date = "25/02/2022";
        String datearr [] = date.split("/");
        System.out.println(Arrays.toString(datearr));
        System.out.println("Day: " + datearr[0]);
        System.out.println("Month: " + datearr[1]);
        System.out.println("Year: " + datearr[2]);


        // 2nd way
        System.out.println(date.split("/")[0]); // 25     Seperated from the slash except 0 index of array.
        System.out.println(date.split("/")[1]); // 02     Seperated from the slash except 1 index of array.
        System.out.println(date.split("/")[2]); // 2022   Seperated from the slash except 2 index of array.










    }
}
