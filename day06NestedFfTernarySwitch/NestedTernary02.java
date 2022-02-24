package day06NestedFfTernarySwitch;

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

        String pwd = "ia1b3urc";

        String isValid = (pwd.length()>8) ? (pwd.charAt(0)=='i' ? "Valid password" : "Invalid password") : (pwd.charAt(0)=='K' ? "Valid password" : "Invalid password");
        System.out.println(isValid);
    }
}


