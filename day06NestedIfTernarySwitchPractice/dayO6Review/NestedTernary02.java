package day06NestedIfTernarySwitchPractice.dayO6Review;

public class NestedTernary02 {

    /*
    Tyep code to check the password
    if it has more than 8 characters, it should be 'i'
    if it has not more than 8 characters, initial should be 'K'
      Solve the task by using nested-ternary
     */

    //length() method returns the number of characters in a String.
    //For example "Ali Can".length() ==> 7
    public static void main(String[] args) {

       /*

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password");
        String psw = scan.nextLine();

        */

        String pwd = "ksjhf34".toLowerCase();

        String pwdValid = (pwd.length()>8 )?
                (pwd.charAt(0)=='i'  ? "It contains 'i' " : "not valid passowr"):
                (pwd.charAt(0)=='k'  ? "it contains 'k' " : "not valid passowr");

        System.out.println(pwdValid);













/*
        String pwd = "kALHAR".toUpperCase();

        String valid = pwd.length()>8 ? (pwd.charAt(0)=='i'? "Valid Password"  : "Not valild Paswword") : (pwd.charAt(0) == 'K'? "Valid password" :  "Not valid Password");

        System.out.println(valid);

 */


    }
}


