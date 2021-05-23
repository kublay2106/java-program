package pimeNo;

import java.util.Scanner;

public class PrimeNo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =0;
		int i;
		for ( i = 2; i< n; i++)
		{
			if(n%i == 0)
			{
				temp =temp +1;
			}
			
		}
		if(temp>0 || n<2)
		{
			System.out.println( n + " is not a prime no" );
		}
		else
		{
			System.out.println( n+" is  a prime no" );
		}

	}

}
