package Conditionalstatement;

import java.util.Scanner;

public class SwitchCaseApaniKasha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int daysOfWeek = sc.nextInt();
		 switch(daysOfWeek)
		 {
		 case 1:
			 System.out.println("I'm on leave");
			 break;
		 case 2:
			 System.out.println("I'm on office");
			 break;
		 case 3:
			 System.out.println("I'm playing football");
			 break;
		 default:
			 System.out.println("I dont 't know what it is");
		 }

	}

}
