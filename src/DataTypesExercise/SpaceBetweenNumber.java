package DataTypesExercise;

import java.util.Scanner;

public class SpaceBetweenNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n1= num.nextInt();
		int[] n2 = new int[6];
		for(int i=0;i<6; i++ )
		{
			n2[i]= n1%10;
			n1= n1/10;
		}
		for(int i=5;i>=0; i-- )
		{
			System.out.print(n2[i]+" ");
		}
		
	}

}
