package DataTypesExercise;

import java.util.Scanner;

public class TempConvert {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the Temp in C:");
		int c1= num.nextInt();
		int f1= (int) ((c1*1.8)+32);
		System.out.println("Temp in Fahrenheit is: "+ f1);
		System.out.println("...........................");
		System.out.println("Now, Enter Temperature in F: ");
		int f2= num.nextInt();
		int c2= (int) ((f2-32)/1.8);
		System.out.println("Temp. in Celsius is: "+ c2);		

	}

}
