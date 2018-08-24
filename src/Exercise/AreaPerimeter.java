package Exercise;

import java.util.Scanner;

public class AreaPerimeter {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("The Radius of the cirle is: ");
		double r=num.nextDouble();
		double a= Math.PI* (r*r);
		double p = 2 * Math.PI * r;
		System.out.println("The area of the Radius " +r + " is: " + a);
		System.out.println("The Perimeter of the Radius " +r + " is: " + p);	

	}

}
