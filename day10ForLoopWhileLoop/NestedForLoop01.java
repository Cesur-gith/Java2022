package day10ForLoopWhileLoop;

public class NestedForLoop01 {

    public static void main(String[] args) {

        // For 1 - I need to print h1 three times == ( h1, h1, h1)
        //For 2 - I need to print h2 three times == ( h2, h2, h2)
        //For 3 - I need to print h3 three times == ( h3, h3, h3)
        // So this is a Nested Loop

        //1.Example: Type 3 times Hello1 for 1, 3 times Hello2 for 2, 3 times Hello3 for 3, 3 times Hello4 for 4 on the console        //

        for (int i = 1; i<5; i++){



            for (int k = 1; k<4; k++){

                System.out.println("Hello" + i);

            }
        }













    }
}
