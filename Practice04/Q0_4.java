package Practice04;

public class Q0_4 {

        public static void main(String[] args) {

            /*
             * Create a method that can add the even numbers in the array
             * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
             * OUTPUT : The sum of even numbers is  : 30
             */

            int array [] [] = {{1,3,6},{2,8},{5,7,9,14}};
            int brr [] [] = {{1,3,8},{6,8},{5,12,9,14}};

            System.out.println(sumOfEvent(array));
            System.out.println(sumOfEvent(brr));
        }

        public static int sumOfEvent(int array[] [] ){  // we use void so it should be syso not return

            int sum = 0;

            for (int w [] : array) { // For the first element we should use array

                for ( int m: w) { // for the second for loop is integer

                    if (m % 2 == 0){

                        sum = sum +m;
                    }
                }

            }
            return(sum);
        }



    }
