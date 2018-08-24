package Exercise;

import java.util.Random;


public class AreaOfPolygon2 {

	public static void main(String[] args) {
		Random num= new Random();
		int n= num.nextInt(10)+1;
		System.out.println("Enter the Side of the Polygone: "+n);
		int l= num.nextInt(10)+1;
		System.out.println("Enter the length of the Side is: "+l);
		
		double a= (n* (l*l))/(4 * Math.tan(Math.PI/n));
		System.out.println("The area of the Polygon is: "+ a);
		
	}

}
