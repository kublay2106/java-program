package Apanikashaprojects;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the star--->");
		
		
		int starOf = sc.nextInt();
		
		
		for(int i = 1 ; i<=starOf; i++)
		{
			for(int j =1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//System.out.println();

	}

}
