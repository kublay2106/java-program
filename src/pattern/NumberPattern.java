package pattern;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		for (int i =1; i<=r;i++)
		{
			for (int j =1;j<=i;j++)
			{
				//System.out.print(" "+j);
				//if(i<=10) 
				System.out.print(i);
			}	
			
			System.out.println();
		}

	}

}
