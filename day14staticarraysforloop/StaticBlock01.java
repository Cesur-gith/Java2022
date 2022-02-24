package day14staticarraysforloop;

public class StaticBlock01 {

        // when you click on main method run button, class loader will be activated
        // then it will load the class into the memory
        /*
        * Sometimes we need some data just after the class loaded
        * for that kind of scenarios we use "static block"
        * when you use "static block" it will excuted before "main method", "any other methods", "constructors", I mean it will be the first one exectured
        * */

        // Note: Static Block is used to initialize "static variables" when we want to them before everything in the class
        // Note: If you have multiple "Static blocks" execution order will be from top to down

    static double pi; // to calculate the circle or area
    static double eNumber;

    public StaticBlock01(){
        System.out.println("Constructor");
    }

    static{ // if you want to have data first time, you need to create the code inside the "static block"
        System.out.println("First static block");
        pi = 3.14; // it will be executed first
    }

    static {
        eNumber=2.7; // It will be execute  second
        System.out.println("Second static block");
    }


    public static void main(String[] args) {

        System.out.println("main method");
        StaticBlock01 obj1 = new StaticBlock01();
        double r =2;
        double area = pi*r*r;

        // There is a class loading in java,



    }



}
