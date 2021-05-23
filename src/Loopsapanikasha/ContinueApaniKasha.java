package Loopsapanikasha;

import java.util.Scanner;

public class ContinueApaniKasha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i =1; i<=100; i++)
		{
			if(i>=40 && i<=50)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
