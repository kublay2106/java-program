package pimeNo;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =17;
		boolean isPrime = true;
		for(int i=2;i<Math.sqrt(num);i++)
		{
			if(num%i == 0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(num + "is a prime number");
			
		}
		else {
			System.out.println("not a prime number");
		}
	}

}
