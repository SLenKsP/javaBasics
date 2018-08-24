package DataTypesExercise;

import java.util.Scanner;

public class BMICalc {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter your Height(ft): ");
		int ft=  num.nextInt();
		System.out.println("& inches: ");
		int in= num.nextInt();
		int height= (ft*12)+in;
		System.out.println("Your height is: "+height+"inches");
		System.out.println("Enter your weight(lb): ");
		double weight= num.nextDouble();
		double BMI= (weight/(height*height))*703;
		System.out.println("Your Body Mass Index (BMI) is: "+ BMI);
		

	}

}
