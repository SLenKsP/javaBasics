package ConditionalExercise;

import java.util.Scanner;

public class CubeOfNNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		int n1= num.nextInt();
		int cube=0;
		for(int i=1; i<=n1; i++)
		{
			cube= (int) Math.pow(i, 3);
			System.out.println("number is: "+ i+ " and cube of "+ i+ " is "+ cube );
		}
	}
		
}
