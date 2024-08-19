
public class Fibanacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=1000;i++)
		{
			int c=a+b;
		    if(c<=1000)
		    {
			System.out.println(c);
			a=b;
			b=c;
		    }
		}
		

	}

}
