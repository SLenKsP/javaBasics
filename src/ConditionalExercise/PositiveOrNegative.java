package ConditionalExercise;

import java.util.Scanner;

public class PositiveOrNegative {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n1= num.nextInt();
		if(n1>0)
		{
			System.out.println("The entered number is positive");
		}else
			System.out.println("The entered number is negative");

	}

}
