package DataTypesExercise;

import java.util.Scanner;

public class ReadIntegerAndSumOfDigits {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number Between 0 and 1000:");
		int n1= num.nextInt();
		if(n1>=0 && n1<=1000)
		{
			System.out.println("The entered number is: "+ n1);
			int sum=0;
			while(n1>0)
			{
				int add= n1%10;
				sum= sum+add;
				n1= n1/10;
			}
			System.out.print("The sum of digits of entered number is: "+ sum);
		}else
			System.out.println("The entered number is NOT between 0 and 1000");
	}

}
