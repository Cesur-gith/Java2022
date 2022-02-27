package Y_JavaMaster.Java1;// RETURN , multiple parameters

public class methodreturn_return_multiple_parameters {

	public static int myMethod1(int x) { // Birinci method
		return 5 + x;
	}

	public static int myMethod2(int x, int y) { // Ikinci Method
		return x + y;
	}
	
	public static int myMethod3(int x, int y) { // Ucuncu Method
		return x + y;
	}

	
	public static void main(String[] args) {
		
		System.out.println(myMethod1(5)); 	// Birinci method
		
		System.out.println(myMethod2(10, 5));  // Ikinci Method
		
		int z = myMethod3(20, 25);		// Ucuncu Method  - baska sekli
		System.out.println(z);  
		

	}
}