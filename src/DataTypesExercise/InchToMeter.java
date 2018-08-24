package DataTypesExercise;

import java.util.Scanner;


public class InchToMeter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//show time and date, method is called from "CurrentDateTime.java".
		CurrentDateTime.dateTime();
		
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the Inches: ");
		double Inch= num.nextDouble();
		double Meter= Inch*0.0254;
		double Milimeter= Inch*25.4;
		double Centimeter= Inch/0.39;
		System.out.println("The distance in meter is: "+ Meter);
		System.out.println("Same distance in Milimeter is: "+ Milimeter);
		System.out.printf("Same distance in Centimeter is: %.2f", Centimeter);

	}

}
