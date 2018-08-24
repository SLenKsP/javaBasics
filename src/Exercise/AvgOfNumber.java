package Exercise;

import java.util.Scanner;

public class AvgOfNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n1, n2, n3, n4;
		Scanner num= new Scanner(System.in);
		System.out.println("Enter First Number: ");
		n1= num.nextInt();
		System.out.println("Enter Second Number: ");
		n2= num.nextInt();
		System.out.println("Enter third Number: ");
		n3= num.nextInt();
		n4= (n1+n2+n3)/3;
		System.out.println("An Average of Entered numbers is: " + n4);
		

	}

}
