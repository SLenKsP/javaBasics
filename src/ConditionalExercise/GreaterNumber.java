package ConditionalExercise;

import java.util.Scanner;

public class GreaterNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1= num.nextInt();
		System.out.println("Enter second number: ");
		int n2= num.nextInt();
		System.out.println("Enter third number: ");
		int n3= num.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println("The greatest: "+n1);
		}else if(n2>n1 && n2>n3)
		{
			System.out.println("The greatest: "+n2);
		}else if(n3>n1 && n3>n2)
		{
			System.out.println("The greatest: "+n3);
		}
	}

}
