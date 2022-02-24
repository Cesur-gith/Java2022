package day08stringmanipulationsReview;

public class Sm02 {

    public static void main(String[] args) {


        String fullName = "    Ali Can    ";
        System.out.println(fullName);

        String trimmedName = fullName.trim();
        System.out.println(trimmedName);

        // How can I understand if a String is empty or not

        int numOfChar = fullName.length();
        if (numOfChar ==0){
            System.out.println("Your did not enter your name");
        }else {
            System.out.println("You entered your name");
        }
        // isEmpty() method returns true if there is no characer
        boolean isEmpty = fullName.isEmpty();
        System.out.println(isEmpty);

        // isBlank() method returns true if there is a space character or more than one space or empty
        // For that 3 scenarios isBlank() is used.

        boolean isBlank = fullName.isBlank();
        System.out.println("Is blank? " + isBlank);


    }



}
