package Exercise;

import java.util.Scanner;

public class TableOfNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter number is: ");
		int n1= num.nextInt();
		System.out.println("The table of "+n1+" is:");
		for(int n2=0; n2<=10; n2++)
		{
			int n3= n1*n2;
			System.out.println(n1 +" X " +n2 +" = " + n3 );
		}

	}

}
