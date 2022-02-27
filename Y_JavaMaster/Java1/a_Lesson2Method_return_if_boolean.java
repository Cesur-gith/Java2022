package Y_JavaMaster.Java1;// return value , if else , boolean

public class a_Lesson2Method_return_if_boolean {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 5;

		int answer1;
		int answer2;
		boolean answer3;
		
		answer1 = multNum(num1);
		System.out.println("When we multiply this to 5, we get " + answer1);

		answer2 = addNum(num1, num2);
		System.out.println("When we add num1 and num2, we get " + answer2);

		answer3 = equalNum(num1, num2);
		System.out.println("num1 and num2 are equal " + answer3);
		
	}

	public static int multNum(int a) {
		int ans = a * 5;

		return ans;

	}
	public static int addNum(int b, int c) {
		int ans = b + c;
		
		return ans;
	}
	public static boolean equalNum(int d, int e) {
		if(d == e) return true;
		
		else return false ;
	}

	
}
