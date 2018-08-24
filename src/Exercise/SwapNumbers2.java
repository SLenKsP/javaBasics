package Exercise;

import java.util.Random;


public class SwapNumbers2 {

	public static void main(String[] args) {
		Random num=new Random();
		int n1= num.nextInt(100)+1;
		System.out.println("Enter First Number: "+n1);	
		int n2= num.nextInt(100)+1;
		System.out.println("Enter Second Number: "+n2);		
		System.out.println("Before Swap the First number is: "+n1+ "\n"+ "And Second number is: "+ n2);
		int n3= n1;
		int n11= n2;
		int n21= n3;
		System.out.println("After Swap the First number is: "+n11+ "\n"+ "And Second number is: "+ n21);

	}

}
