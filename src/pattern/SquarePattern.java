package pattern;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter the no of rows");
	/*	int row=sc.nextInt();
		for (int i=0; i<row;i++){
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}*/
		System.out.println("Please enter the no of rows");
		int row=sc.nextInt();
		for (int i=0; i<row;i++){
			for(int j=10;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
//		for(int i=0;i<row;i++) {
//			for(int j=2*(row-i);j>0;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
//
//}

}
