
package day06NestedFfTernarySwitch;

public class Ternary03 {

    /*
           You have 2 integers;
           If both of the integers are postivive do multipication
           if one is negative the other one is positive return "i dont know how to multipy"
     */
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        // If your ternary returns different data types for different scenarios, do not create reserved area for the result. put it directly inside system.outprinln()
        System.out.println(a > 0 && b > 0 ? a * b : "i dont know how to multiply");

    }
}
