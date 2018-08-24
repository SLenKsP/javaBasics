package Exercise;

import java.util.Scanner;

public class AreaPerimeterRect {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Let's find Area and Perimeter of the Rectangle");
		Scanner num= new Scanner(System.in);
		System.out.println("Length: ");
		double l= num.nextDouble();
		System.out.println("Width: ");
		double w= num.nextDouble();
		double a= w*l;
		double p= 2* (l+w);
		System.out.println("Total area is: "+ a);
		System.out.println("Total Perimeter is: "+ p);
		

	}

}
