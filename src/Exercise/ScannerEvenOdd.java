package Exercise;

import java.util.Scanner;

public class ScannerEvenOdd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n1, n2, n3, n4, n5, n6;
		Scanner num= new Scanner(System.in);
		System.out.println("Enter numbers: ");
		n1= num.nextInt();
		n2= num.nextInt();
		n3= num.nextInt();
		n4= num.nextInt();
		n5= num.nextInt();
		n6= n1+n2+n3+n4+n5;
		System.out.println("Entered numbers are:");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println("The Total of these numbers is "+n6);
		if(n6%2==0)
		{
			System.out.println("The Sum number is even");
		}else
			System.out.println("The Sum number is odd");
	}

}
