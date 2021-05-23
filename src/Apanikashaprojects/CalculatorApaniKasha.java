package Apanikashaprojects;

import java.util.Scanner;

public class CalculatorApaniKasha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int a = sc.nextInt();
		System.out.println("Enter Second  no");
		int b = sc.nextInt();
		
		System.out.println("Enter the Operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		
		
		int result = 0;
		
		switch(operation)
		{
		case '+':
			result= a+b;
			System.out.println("Result = " + result);
			break;
		case '-':
			result= a-b;
			System.out.println("Result = " + result);
			break;
		case '*':
			result= a*b;
			System.out.println("Result = " + result);
			break;
		case '/':
			result= a/b;
			System.out.println("Result = " + result);
			break;
		default	:
		System.out.println("invalid operation");
			
		}
		System.out.println("The result is " + result);

	}

}
