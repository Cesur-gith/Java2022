package day14staticarraysforloop;

public class Student {

    String name;
    int year;
    static int counter = 1000;
    String studentId;

    //access modifier   return type. If it is a "void" we dont need to have return type
    public              String      setStudentId(){ // method creating
        counter++;
        studentId= year+ "" +counter;
      // string     int  String  == outcome should be string
      return studentId;// If the return type of the method is different from "void" you have to use "return" keyword inside the method
    }























}

