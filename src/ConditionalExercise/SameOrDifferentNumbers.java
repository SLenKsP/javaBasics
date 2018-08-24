package ConditionalExercise;

import java.util.Scanner;

public class SameOrDifferentNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1= num.nextInt();
		System.out.println("Enter Second number:");
		int num2= num.nextInt();
		System.out.println("Enter Third number:");
		int num3= num.nextInt();
		if((num1==num2)&&(num1==num3))
		{
			System.out.println("All numbers are equal");
		}else if((num1!=num2)&&(num2!=num3))
		{
			System.out.println("All are diffrent");
		}else
			System.out.println("Neither all are equal or different");
	}

}
