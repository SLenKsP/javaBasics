package ConditionalExercise;

import java.util.Scanner;

public class InputNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number");
		int n1= num.nextInt();
		if(n1>0)
		{
			System.out.println("The Value of n = 1");
		}else if(n1==0)
		{
			System.out.println("The Value of n = 0");
		}else if(n1<0)
		{
			System.out.println("The Value of n = Less Than 0");
		}
	

	}

}
