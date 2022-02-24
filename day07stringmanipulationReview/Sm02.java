package day07stringmanipulationReview;

public class Sm02 {

    public static void main(String[] args) {

        String str = "Ali Can";
        String newStr = str.concat("!...") .concat("Congrats..."); // Ali Can!...
        System.out.println(newStr);

        // You can do concatination by using + sign, you can use concat() method


        boolean isLast = str.endsWith("Can");
        System.out.println(isLast);


        boolean isFirst = str.startsWith("A");
        System.out.println(isFirst);

        boolean isFourth = str.startsWith("C", 4);
        System.out.println(isFourth);


    }

}
