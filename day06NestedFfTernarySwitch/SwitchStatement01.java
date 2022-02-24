package day06NestedFfTernarySwitch;

import java.util.Scanner;

public class SwitchStatement01 {

    public static void main(String[] args) {

        /*
        Get the numbers of the day from user and print the name of the day
        For example; 1 = Sunday, 2 = Monday etc.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number...");
        int dayNumbers = scan.nextInt();

        //1 way Solve by using if else if statement

        if (dayNumbers == 1){
            System.out.println("Sunday");
        }else if (dayNumbers==2){
            System.out.println("Monday");
        }else if (dayNumbers==3){
            System.out.println("Tuesday");
        }else if (dayNumbers==4){
            System.out.println("Wednesday");
        }else if (dayNumbers==5){
            System.out.println("Thursday");
        }else if (dayNumbers==6){
            System.out.println("Friday");
        }else if (dayNumbers==7){
            System.out.println("Satuday");
        }else {
            System.out.println("What kind of user are you ? ");
        }

        // 2nd way Solve by using Switch statement
        // When to use switch? if you have more than 3 options switch is perfect
        switch (dayNumbers) {

            case 1:
                System.out.println("Sunday");
                break;// Go outside the switch statements
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalide day numbers");
                break;
        }


    }

}
