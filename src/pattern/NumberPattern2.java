package pattern;

import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int count=0;
		for (int i =1; i<=r;i++)
		{
			for(int j=1 ;j<=i;j++)
			{
				count = count +1;
				System.out.print( " " + count);
			}
			System.out.println();
		}

	}

}
