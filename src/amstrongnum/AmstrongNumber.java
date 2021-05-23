package amstrongnum;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check amstrom number");
		int num =sc.nextInt();
		int c=0,a,temp;
		temp = num;
		while(num>0)
		{
			a = num % 10;
			num =num/10;
			c =c+(a*a*a);
			
			
		}
		if (temp==c)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");
	}

}
