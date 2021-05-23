package Apanikashaprojects;

import java.util.Scanner;

public class Patterns3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1 ; i<=10 ; i++ )
		{
			for ( int j = 10 ; j>=i ;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
