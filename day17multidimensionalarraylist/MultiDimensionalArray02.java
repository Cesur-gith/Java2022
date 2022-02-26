package day17multidimensionalarraylist;

public class MultiDimensionalArray02 {

    public static void main(String[] args) {


        String arr1[][] = { {"learn", "java", "it"}, {"is", "easy"} };
        //Print the elements which have “a” from a 2 dimensional String array

        for (String w [] : arr1) {

            for (String m : w) {

                if (m.contains("a")){
                    System.out.print(m + " ");
                }
            }

        }

    }
}
