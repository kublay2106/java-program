package Apanikashaprojects;

import java.util.Scanner;

public class SquareOfAnyNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int b = sc.nextInt();
		int result = 1;
		for (int i =0; i<=b; i++)
		{
			result*=n;
			System.out.println(result);
		}

	}

}
