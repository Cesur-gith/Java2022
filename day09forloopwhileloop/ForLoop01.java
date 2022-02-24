package day09forloopwhileloop;

public class ForLoop01 {


    public static void main(String[] args) {

        //1.Example: Type code to print 5 times "Hello!" on the console
        //1.Way: Not recommended a)Repetition b)For larger numbers impossible to do
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");

        //2.Way: For repeated actions Java created a structure which is loops
        //       There are 4 different loop structure in Java a)for-loop b)while-loop c)do-while-loop d)for-each-loop
        System.out.println("==============");

        //for-loop
        for(int i=1; i<6; i+=1){
            System.out.println("Hello!");
        }

        System.out.println("==============");

        //2.Example: Type all integers from 11 to 44 in the same line with a space between consecutive integers
        for(int i=11; i<45; i+=1){
            System.out.print(i + " ");
        }

        System.out.println("==============");

        //3.Example: Type even integers from 11 to 44 in the same line with a space between consecutive integers
        for(int i=11; i<45; i+=1){

            if(i%2==0){
                System.out.print(i + " ");
            }

        }


    }

}
