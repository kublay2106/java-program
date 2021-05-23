package pattern;

import java.util.Scanner;

public class LinePeramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		// TODO Auto-generated method stub
		for(int i =r;i>=1;i--)
		{
			for(int j= r;j>i;j--) {
				System.out.print(" ");
			}
			for (int k= 1; k<(i*2) ; k++) {
				if(k>1 && k<(i*2)-1) {
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i =1;i<=r;i++)
		{
			for(int j= r;j>i;j--) {
				System.out.print(" ");
			}
			for (int k= 1; k<(i*2) ; k++) {
				if(k>1 && k<(i*2)-1) {
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
