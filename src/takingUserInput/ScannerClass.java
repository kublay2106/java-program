package takingUserInput;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
         
        // System.out.print("please enter the value of ");
//         int x =sc.nextInt();
//         double y =sc.nextDouble();
//         System.out.println(y);
//         
//         System.out.println("The value of x is ---:" + x);
         String name = sc.nextLine();
         System.out.println("My name is"  + " " +name);
	}

}
