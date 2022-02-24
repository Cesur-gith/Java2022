package day09forandwhileloopReview;

public class ForLoop01 {

    public static void main(String[] args) {


        //1.Example: Type code to print 5 times "Hello!" on the console
        //1.Way: Not recommended a)Repetition b)For larger numbers impossible to do

        int num = 0;
        for (int i = 0; i <5 ; i++){
            System.out.println("Hello");
        }

        System.out.println("======================");


        //2.Example: Type all integers from 11 to 44 in the same line with a space between consecutive integers


        for (int k = 11; k <45 ; k++){
            System.out.print (k + " ");
        }

        System.out.println("");
        System.out.println("======================");

        //3.Example: Type even integers from 11 to 44 in the same line with a space between consecutive integers

        for (int n = 11; n<45; n++){
            if (n%2==0){
                System.out.print(n + " ");
            }
        }
        System.out.println("");
        System.out.println("======================");

































    }
}