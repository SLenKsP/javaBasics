package Exercise;

import java.util.Scanner;

public class AreaOfPolygon {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the Side of the Polygone: ");
		double n= num.nextDouble();
		System.out.println("Enter the length of the Side is: ");
		double l= num.nextDouble();
		double a= (n* (l*l))/(4 * Math.tan(Math.PI/n));
		System.out.println("The area of the Polygon is: "+ a);
		
	}

}
