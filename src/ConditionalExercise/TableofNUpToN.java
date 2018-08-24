package ConditionalExercise;

import java.util.Scanner;

public class TableofNUpToN {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n1= num.nextInt();
		for(int i=0; i<=n1; i++)
		{
			System.out.println(n1 + " x "+ i +" = "+ Math.multiplyExact(i, n1));
		}
		

	}

}
