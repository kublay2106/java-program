package pattern;

import java.util.Scanner;

public class CrossPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int r= sc.nextInt();
		for (int i=0; i<r;i++)
		{
			for(int j =0; j<r;j++)
			{
				if(i == j || i + j ==r-2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
