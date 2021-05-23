package javaNumberPrograms;
import java.io.*;
import java.util.*;


public class PetersonNumber {
	
	public static int fac(int s)
	
	{
		int f =1;
		for(int i =1; i<=s;i++)
		{
			f= f*i;
			
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check:");
		int n = sc.nextInt();
		int s = n;
		int sum=0;
		while(s!= 0)
		{
			int d = s%10;
		    sum =sum+fac(d);
			s =s/10;
		}
		if (n==sum)
		{
			System.out.println("strong no");
			
		}
		else
		{
			System.out.println("Not a strong no");
		}
		

	}

}
