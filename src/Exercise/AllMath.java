package Exercise;

import java.util.Scanner;

public class AllMath {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner Num= new Scanner(System.in);
		System.out.println("Enter First number:");
		int n1= Num.nextInt();
		System.out.println("Enter Second Number: ");
		int n2= Num.nextInt();
		int n3= n1+n2;
		int n4= n1-n2;
		int n5= n1*n2;
		int n6= n1/n2;
		int n7= n1%n2;
		System.out.println("The Sum of these two numbers is: "+ n3);
		System.out.println("The Subtraction of these two numbers is: "+ n4);
		System.out.println("The Multiple of these two numbers is: "+ n5);
		System.out.println("The Division of these two numbers is: "+ n6 );
		System.out.println("The Mod of these two numbers is: "+ n7);

	}

}
