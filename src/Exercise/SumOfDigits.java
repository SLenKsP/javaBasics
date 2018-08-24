package Exercise;

import java.util.Scanner;

public class SumOfDigits {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter number");
		int n1= num.nextInt();
		int sum=0;
		while(n1>0)
		{
			int add= n1%10;
			sum= sum+add;
			n1=n1/10;
		}
		System.out.println("Sum of digits for the entered integer: "+sum);
}

}