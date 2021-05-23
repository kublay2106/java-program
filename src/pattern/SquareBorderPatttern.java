package pattern;

import java.util.Scanner;

public class SquareBorderPatttern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		for (int i =1; i<=r;i++)
		{
			for(int j = 1; j<=r;j++)
			{
				if(i>=2 && j>=2 && i<=r-1 && j<=r-1)
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
