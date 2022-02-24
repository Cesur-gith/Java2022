package day14staticarraysforloop;

public class StudentRunner {

    public static void main(String[] args) {

        //To access static class members "class name " is enough to access
        // To access the information / inputs from base class you should use "Static" keyword

        System.out.println(Student.counter);


        // To access non static class members you have to create an object

        Student std1 = new Student(); // this is my object and I can access to another class
        System.out.println(std1.setStudentId());


    }
}

























