
public class PetrolPriceAverage {

	public static void main(String[] args) {
		Double[] Prices= {91.2,96.4,92.7,98.9,95.6,90.1};
		double sum=0;
		for(int i=0;i<Prices.length;i++)
		{
			sum+=Prices[i];
	
		}
		double averagePrice=sum/Prices.length;
		System.out.println("The average of Petrol price is " +averagePrice);
	}

}
