package pattern;

import java.util.Scanner;

public class NumberPattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int count=0;
		for(int i=1; i<=r;i++)
		{
			
			if(i%2!=0) {
				for(int j=1; j<=r;j++)
				{
					count = count +1;
					System.out.print(count + " ");
					
					
				}
			}
			else
			{
				int temp = count+1;
				for(int j=count+r; j>=temp;j--)
				{
					count = count +1;
					System.out.print(j+ " ");
					
					
				}
			}
			System.out.println();
			
		}

	}

}
