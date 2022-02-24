package day08stringmanipulationsReview;

public class Sm01 {

    public static void main(String[] args) {

   /*
        If you type code which runs just for specific data it is called "Hard Coding" and
        "Hard Coding" is not acceptable in coding
     */


        String str = "Ali! is 13 years old, I think he is 15.";

        //1.Example: Remove all space characters from the String

           String noSpace = str.replaceAll(" ","");
        System.out.println(noSpace);

        String stars = str.replaceAll("\\d", "*");
        System.out.println(stars);





    }
}
