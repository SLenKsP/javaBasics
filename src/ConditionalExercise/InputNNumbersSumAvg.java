package ConditionalExercise;

import java.util.Scanner;

public class InputNNumbersSumAvg {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		int sum=0, avg=0;
		for(int n1=0; n1<=5; n1++)
		{
			n1= num.nextInt();
			sum+=n1;
			avg=sum/n1;
		}
		System.out.println("The sum of entered numbers is: "+ sum);
		System.out.println("the average of entered numbers is: "+ avg);

	}

}
