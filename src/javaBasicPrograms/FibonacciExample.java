package javaBasicPrograms;

import java.util.Scanner;

public class FibonacciExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,r;
		 a= 0;
		 b=1;
		r = sc.nextInt();	
		System.out.print(a + " " + b);
		for (int i =0; i<r ;i++)
		{
			c = a+b;
			System.out.print( " " +c);
			a=b;
			b=c;
		}

	}

}
