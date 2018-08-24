package ConditionalExercise;

import java.util.Scanner;

public class QuadraticFormula {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("a= ");
		double a= num.nextDouble();
		System.out.println("b= ");
		double b= num.nextDouble();
		System.out.println("c= ");
		double c= num.nextDouble();
		double x1, x2, x3, y, z;
		y= (b * b) - 4 * a * c;
		z= Math.sqrt(y);
		x1= (-b + z)/(2 * a);
		x2= (-b - z)/(2 * a);
		x3= (-b)/(2 * a);
		if(z>0.0)
		{
			System.out.println("Possible Quadratic values are "+ x1 + " and "+ x2);
		}else if(z==0)
		{
			System.out.println("Possible Quadratic value is: " + x3);
		}else
		{
			System.out.println("not a valid number");
		}

	}

}
