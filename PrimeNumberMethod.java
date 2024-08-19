
public class PrimeMethod {

	public static void main(String[] args)
	{{
		int num=41;
		System.out.println(isPrime(num)?"Prime" : "Not Prime");}
	}
	public static boolean isPrime(int num) {
		
		if (num<=1) return false;
		for (int i=2;i<=num/2;i++) {
			if (num % i==0) return false;
			}
		return true;
		}

}
