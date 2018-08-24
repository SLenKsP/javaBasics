package DataTypesExercise;

import java.util.Random;

public class SqCbFthPower {

	public static void main(String[] args) {
		Random num= new Random();
		int n1= num.nextInt(50)+1;
		System.out.println("Entered number is: "+ n1);
		int sq= (int) Math.pow(n1,2);
		int cube= (int) Math.pow(n1,3);
		int ForthPower= (int) Math.pow(n1,4);
		System.out.println("The Square of "+ n1+ " is: "+ sq);
		System.out.println("The Cube of "+ n1+ " is: "+cube);
		System.out.println("The Forth Power of "+ n1+ " is:"+ForthPower);
		

	}

}
