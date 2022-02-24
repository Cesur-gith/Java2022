package Practice_extra;

public class Q5 {

    public static void main(String[] args) {

        /*
         * create a method(make return type boolean) to test
         * if an array contains a specific value-returns true or false
         * Then print the result in main method
         *
         * input[]= {1,2,3,4,5,6,7} num:6
         * Output : "Array contains 6"
         */

        int array [] = {1,2,3,4,5,6,7};
        int num = 6;

        //Call the method. We check if it is true or not
        System.out.println(checkElement(array,num)); // it checks is there any element that equals to num

        // after we check with if statement to write on the console
        if (checkElement(array, num)){ // putting the method in sout to write on the console
            System.out.println("Arrays contains " + num);
         }else {
            System.out.println("Arrays does not contain " + num);
        }

    }

    public static boolean checkElement (int array[], int num){ // I dont get , why used int num because we need to check if there is a that number or not

        boolean result  = false;


        for (int each : array) { // look at the array one by one

            if (each == num){

                result = true;

            }

        }
        return result;  // Return type is boolean


    }


}
