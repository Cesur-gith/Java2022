package day14staticArraysForEachLoopPractice;

public class Q03 {

    public static void main(String[] args) {


                    /*
                  Create a method and
            from a given array find all pairs whose sum is a given number,
            {4,6,5,-10,8,5,20} ===> 10
                  4 + 6 = 10
                  5 + 5 = 10
                 -10 + 20 = 10
            */

        int arr [] = {4,6,5,-10,8,5,20}; // for summing these pairs I shoud use "for loop"
        findPairs(arr, 10);


    }
            // create a method outside the main method
    public static void findPairs (int arr[], int num){ // This is a method

        for (int i = 0; i < arr.length; i++){

            for (int k = i + 1; k< arr.length; k++){ //

                if (arr[i] + arr[k] == num){

                    System.out.println(arr[i] + " + " + arr[k] + " = " + num);

                }







            }






        }




    }



}
