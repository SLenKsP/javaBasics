package ConditionalExercise;

import java.util.Scanner;

public class NumbersSameOrNot {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("First number: ");
		double n1= num.nextDouble();
		System.out.println("Second number: ");
		double n2= num.nextDouble();
		//n1= Math.round(n1*1000);
		//n1= n1/1000;
		//n2= Math.round(n2*1000);
		//n2= n2/1000;
		if(n1==n2)
		{
			System.out.println("Both numbers are same");
		}else
			System.out.println("Both are different");
	}

}
