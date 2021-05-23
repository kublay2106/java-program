package pattern;
import java.util.*;
public class DiamondShapePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int r= sc.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=r;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =1; i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=r;k>=i;k--) {
				System.out.print("*");
			}
			for(int l=r-1;l>=i;l--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
