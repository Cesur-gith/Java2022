package Practice_extra;

public class Q2 {

    public static void main(String[] args) {

 char colorCode = 'y';
 switch (colorCode) {

     case 'r':
         colorCode = 100;
         break;
     case 'b':
         colorCode = 10;
         break;
     case 'y':
         colorCode = 1;
         break;

 }

 System.out.println(colorCode);

      /*
 What is the result?
 A. It results in a compile time error at line 22.
 B. It results in a compile time error at line 11.
 C. It prints : 1
 D. It results in a compile time error at lines at lines 14 and 17.
         */
    }
}
