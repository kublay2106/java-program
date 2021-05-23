package Conditionalstatement;

import java.util.Scanner;

public class NestedIfElseApaniKaksha {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = 10;
	
	int b = 20;
	int c =30;
	int result =0;
//	if(a>b)
//	{
//		if(a>c)
//		{
//			result =a;
//			
//		}else {
//			result = c;
//			
//		}
//	}else {
//		if(b>c)
//		{
//			result =b;
//			
//		}else {
//			result = c;
//		}
//	}
	result =a>b ?a>c? a:c:b>c?b:c;
	System.out.println("Largest of the three number is "  + result);
	}

}
