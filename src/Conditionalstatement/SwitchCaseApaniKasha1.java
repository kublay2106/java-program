package Conditionalstatement;

import java.util.Scanner;

public class SwitchCaseApaniKasha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your reviews");
		int rating = sc.nextInt();
		switch(rating)
		{
		case 1:
		case 2:
			System.out.println("Bad review");
			break;
		case 3:
			System.out.println("Average review");
			break;
		case 4:
		case 5:	
			System.out.println("Good review");
			break;	
		}

				
	}

}
