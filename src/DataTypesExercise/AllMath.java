package DataTypesExercise;

import java.util.Scanner;

public class AllMath {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1= num.nextInt();
		System.out.println("Enter the second number:");
		int n2= num.nextInt();
		System.out.println("The sum of 2 numbers is: "+ (Math.addExact(n1, n2)));
		System.out.println("The Difference between 2 numbers is: "+(Math.subtractExact(n1, n2)));
		System.out.println("The product of these 2 numbers is: "+ (Math.multiplyExact(n1, n2)));
		System.out.println("The average of these 2 numbers is: "+ ((n1+n2)/2));
		System.out.println("The distance from number 1 to number 2 is: "+(Math.abs(n1-n2)));
		System.out.println("The maximum of these two number is: " + (Math.max(n1, n2)));
		System.out.println("The minimum of these two number is: "+ (Math.min(n1, n2)));
	}

}
