package pattern;

import java.util.Scanner;

public class PyramidStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stubann
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		/*for(int i=1;i<=r;i++)
		{
			for(int j=r;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}*/
		/*for(int i=1;i<=r;i++)
		{
			for(int j=r; j>0;j--)
			{
				if(j>i) {
					System.out.print(" ");
				}
				else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=r;i++)
		{
			for(int j=r; j>0;j--)
			{
				if(j>i) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}*/
		for(int i=1;i<=r;i++)
		{
			for(int j=1; j<=i;j++)

			{
				System.out.print(" ");
			}
			for(int k= r; k>=i;k--) {
				System.out.print("*");
			}
			for(int l= r-1; l>=i;l--) {
				System.out.print("*");
			}
			System.out.println();
	}

	}
}

