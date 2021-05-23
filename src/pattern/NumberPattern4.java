package pattern;

import java.util.Scanner;

public class NumberPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		for(int i=1; i<=r;i++)
		{
			for(int j=r;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			
		}
		

	}

}
