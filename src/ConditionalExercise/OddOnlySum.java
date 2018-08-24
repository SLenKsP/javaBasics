package ConditionalExercise;

import java.util.Scanner;

public class OddOnlySum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n1= num.nextInt();
		int sum=0;
		for(int i=1; i<=n1; i++)
		{
			System.out.println((2*i)-1);
			sum+=(2*i)-1;
		}
		System.out.println("The sum is: "+sum);

	}

}
