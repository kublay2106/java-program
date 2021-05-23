package javaNumberPrograms;
import java.util.*;

public class StrongNo {
	
	
	public static int factorial(int n)
	{
		int f= 1;
		for(int i =1; i<=n;i++)
		{
			f = f*i;
			
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no ");
		int n =sc.nextInt();
		int no =n;
		int sum =0;
		while(n!=0)
		{
			int d = n%10;
			
			sum = sum+factorial(d);
			
			
			n = n/10;
		}
		if(sum==no)
		{
			System.out.println("Strong No");
		}
		else
		{
			System.out.println("Not a Strong no");
		}
		

	}

}
