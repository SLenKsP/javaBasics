package Exercise;

import java.util.Scanner;

public class EvenOdd {

	private static Scanner number;

	public static void main(String[] args) {
		number = new Scanner(System.in);
		System.out.println("The Entered number is ");
		long enter= number.nextLong();
		if(enter%2==0)
		{
			System.out.println("The entered number is Even");
		}else
			System.out.println("The entered number is Odd");
	}

}
