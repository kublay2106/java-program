package randomNumber;
import java.lang.Math;
import java.util.Scanner;

public class Ramdomnum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("1 st Random number: "  + Math.random());
//		System.out.println("2 st Random number: "  + Math.random());
//		System.out.println("3 st Random number: "  + Math.random());
//		System.out.println("4 st Random number: "  + Math.random());
//		System.out.println("5 st Random number: "  + Math.random());
		Scanner sc = new Scanner(System.in);
		int min,max;
		System.out.println("Enter the max number\n");
		max=sc.nextInt();
		System.out.println("Enter the min number");
		min=sc.nextInt();
		System.out.println("The ramdom number between " + max + " and " + min +"numerber");
		int a = (int)Math.random() * (max - min + 1) + min  ;
		System.out.println("The random number is" + a);

	}

}
