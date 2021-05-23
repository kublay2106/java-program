package Apanikashaprojects;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int table=0;
		
		for(int j=1; j<=20; j++)
		{
			table =j;
		for(int i = 1; i<=10; i++)
		{
			System.out.print(table*i  + " ");
		}
		System.out.println();
		}

	}

}
