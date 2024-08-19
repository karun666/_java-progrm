

public class ReverseDigitProgram {
	public static void main(String[] args) {
		int n = 745, rev = 0;
		System.out.println("Reversed digits:");
		
		while (n!=0){
			int digit = n%10;
		rev = rev * 10 + digit;
		n/=10;
		
		
		// print each digit one by one
	System.out.println(digit);
	}
	}
}