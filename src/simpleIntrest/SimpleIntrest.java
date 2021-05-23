package simpleIntrest;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principal amount:");
		int principal=sc.nextInt();
		System.out.println("enter the rate of intrest:");
		
		float rate=sc.nextFloat();
		System.out.println("enter the time duration:");
		int time=sc.nextInt();
		float si =principal*rate*time/100;
		System.out.println("The simple interest of the given amount is : " + "  " + si);

	}

}
