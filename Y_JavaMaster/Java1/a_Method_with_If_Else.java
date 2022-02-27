package Y_JavaMaster.Java1;

public class a_Method_with_If_Else {

	public static void main(String[] args) {

		Checkage(20); // Call the checkAge method and pass along an age of 20
		
	}
	  
	// Create a checkAge() method with an integer variable called age
	private static void Checkage(int age) {
	   
		// If age is less than 18, print "access denied"
		if(age < 18) {
			System.out.println("You are not allowed to enter");

		// If age is greater than, or equal to, 18, print "access granted"
		}else {
			System.out.println("You can enter");
		}
		
	}
}
