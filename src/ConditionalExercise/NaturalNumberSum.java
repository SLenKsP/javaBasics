package ConditionalExercise;

import java.util.Scanner;

public class NaturalNumberSum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number between 1 to 10: ");
		int n1= num.nextInt();
		int sum=0;
		for (int i=1; i<=n1; i++)
		{
			//System.out.println(i);
			sum+=i;
			
		}
		System.out.println("The sum of natural number up to " + n1+ " is " +sum);
		System.out.println("The average is: "+ (sum/n1));
	}

}
