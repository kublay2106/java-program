package javaNumberPrograms;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no= sc.nextInt();
//		int v = n;
//		int revs=0;
//		while(v!=0)
//		{
//			int r = v%10;
//			revs= revs*10+r;
//			v=v/10;
//		}
//		System.out.println("The revrse of "+ n + "  is   "+ revs);
		int rem,revs=0;
		while(no!=0)
		{
			rem= no%10;
			revs= revs*10+rem;
			no=no/10;
			
		}
		System.out.println(revs);
		
	}

}
