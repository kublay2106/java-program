package javaNumberPrograms;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = n*n;
		while(n!=0)
		{
			if(n%10 != s%10)
			{
				System.out.println("False");
				n = n/10;
				s= s/10;
			}
			else
			{
				System.out.println("true");
				break;
			}
			
		}
		

	}

}
