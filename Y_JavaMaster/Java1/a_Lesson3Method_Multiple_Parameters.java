package Y_JavaMaster.Java1;    // Multiple Parameters / You can have as many parameters as you like:

public class a_Lesson3Method_Multiple_Parameters {

	public static void main(String[] args) {

		myMethod1("Alex"); // add argument to match "myMethod(String)"
		myMethod1("Laura"); // add argument to match "myMethod(String)"
		myMethod1("Mike"); // add argument to match "myMethod(String)"

		myMethod2("Mile", 8); // add argument to match "myMethod(String)"
		myMethod2("Harry", 14); // add argument to match "myMethod(String)"
		myMethod2("Ron", 18); // add argument to match "myMethod(String)"


	}

	public static void myMethod1(String fname) {

		System.out.println(fname + " Adam");
	}
//__________________________________________________________________________________________________________
	// Multiple Parameters / You can have as many parameters as you like:

	public static void myMethod2(String fname, int age) {

		System.out.println(fname + " Branson is " + age + " years old ");

	}

}
