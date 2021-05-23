package pattern;

import java.util.Scanner;

public class LineStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r =sc.nextInt();
		for(int i= 1; i<=r; i++)
		{
			for(int j = 1; j<=i; j++) {
				if(i>=2 && j<=i-1 )
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i= 1; i<=r; i++)
		{
			for(int j =r; j>=i; j--) {
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++) {
				if(i>=2 && k>1 )
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
		
			System.out.println();
		}
		}
	}


