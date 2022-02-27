package Y_JavaMaster.Java1;

public class b_Java_Method_Overloading {

	public static void main(String[] args) {

// Java Method Overloading
// With method overloading, multiple methods can have the same name with different parameters:

		int myNum1 = plusMethodInt(8, 5);
		double myNum2 = plusMethodDouble(4.3, 6.26);
		
		System.out.println("int: " + myNum1);
		System.out.println("double: " + myNum2);
	}

	public static double plusMethodDouble(double a, double b) {
		return a + b;
	}

	public static int plusMethodInt(int x, int y) {
		return x + y;
	}

}
