package pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the no of rows:");
		int r =sc.nextInt();
		for(int i =1 ; i<=r ; i++) {
			for(int j = r -1; j>=i; j--) {
				System.out.print(" ");
			}
		for (int k = 1; k<=i; k++)	
		{
			System.out.print("*");
		}
		System.out.println();
		}

	}

}
