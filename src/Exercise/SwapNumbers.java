package Exercise;

import java.util.Scanner;

public class SwapNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter First Number: ");	
		int n1= num.nextInt();
		System.out.println("Enter Second Number: ");
		int n2= num.nextInt();
		System.out.println("Before Swap the First number is: "+n1+ "\n"+ "And Second number is: "+ n2);
		int n3= n1;
		int n11= n2;
		int n21= n3;
		System.out.println("After Swap the First number is: "+n11+ "\n"+ "And Second number is: "+ n21);

	}

}
