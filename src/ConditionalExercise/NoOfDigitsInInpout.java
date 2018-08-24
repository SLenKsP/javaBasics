package ConditionalExercise;

import java.util.Scanner;

public class NoOfDigitsInInpout {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number: ");
		long input_number= num.nextLong();
		int count=0;
		if(input_number<1000000000)
		{
			while(input_number>0)
			{
				input_number/=10;
				count++;	
			}
			System.out.println("Number of digits: "+count);
			
		}else
			System.out.println("Number is too large");
	}

}
