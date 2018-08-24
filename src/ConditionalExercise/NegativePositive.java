package ConditionalExercise;

import java.util.Scanner;

public class NegativePositive {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number:");
		float n1=num.nextFloat();
		if(n1>0)
		{
			if(n1<1)
			{
				System.out.println("positive Small");
			}else if(n1>1000000)
			{
				System.out.println("positive Large");
			}else 
				System.out.println("Positive");
		}
		if(n1<0)
		{
			if(Math.abs(n1)<1)
			{
				System.out.println("Negative small");
			}else if(Math.abs(n1)>1000000)
			{
				System.out.println("Negative Large");
			}else
				System.out.println("Negative");
		}else
			System.out.println("Zero");
	}

}
