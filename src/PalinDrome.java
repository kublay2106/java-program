import java.util.Scanner;

public class PalinDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		
		int tem=num;
		int rev = 0;
		while(tem!=0)
		{
			int d = tem%10;
			rev= 10*rev + d;
			tem  = tem/10;
			
		}
		if(rev == num)
		{
			System.out.println("this number is palindrome number");
		}
		else {
			System.out.println("Thh number is not a palindrome number");
		}
	}

}
