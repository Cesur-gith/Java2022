package Practice_extra;

public class Q4 {


    public static void main(String[] args) {


        /*
         * write a method that accepts an array and prints true
         * if the sum of all 3's in the array is exactly 9
         *
         * Input : {2,3,5,3,6,3,7} output :true
         * Input : {2,3,4,5,6,3,7} output :false
         */


        int array [] = {2,3,5,3,6,3,7};
        intArray (array);
        int array2 [] = {2,3,4,5,6,3,7};
        intArray (array2);

    }

    // Create a method
    public static void intArray (int array[]) {

        int sum = 0; // We have to to create a container to store


        for ( int w : array ) { // Looking all the elements of given array one by one
                                // For each Loop looks/ checks the array one by one
            if (w == 3){ // if the w is equals to 3 add it to the sum
                sum = sum + w; // or sum += w
            }
        }

        if (sum ==9){
            System.out.println("true");
        }else {
            System.out.println("false");
        }









    }



}
