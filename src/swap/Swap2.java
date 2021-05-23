package swap;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x,y,z ,swap;
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		 swap =x;
		 x=y;
		 y=z;
		 z=swap;
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
		 
		

	}

}
