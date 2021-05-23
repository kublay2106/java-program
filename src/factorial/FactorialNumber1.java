package factorial;

import java.util.Scanner;

public class FactorialNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to factoreised");
		int num =sc.nextInt();
		int i,fact=1;
		for(i=1;i<=num;i++)
		{
			fact= fact*i;
			System.out.println(fact);
		}
		System.out.println("Factorial of    " + num+"   is   "+fact);
		
		

	}

}
