package Exercise;

import java.util.Scanner;

public class Multiple {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner Num= new Scanner(System.in);
		System.out.println("Enter First number:");
		int n1= Num.nextInt();
		System.out.println("Enter Second Number: ");
		int n2= Num.nextInt();
		int n3= n1*n2;
		System.out.println("The Sum of these two numbers is: "+ n3);
		
		
		
	}

}
