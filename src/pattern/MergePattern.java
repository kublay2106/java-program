package pattern;

import java.util.Scanner;

public class MergePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		for(int i=1; i<=r; i++) {
			for (int j=1 ; j<=i; j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		for(int i=1; i<=r; i++) {
			for (int j=r-1 ; j>=i; j--)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		

	}

}
