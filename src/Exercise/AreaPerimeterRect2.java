package Exercise;

import java.util.Scanner;

public class AreaPerimeterRect2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Let's find Area and Perimeter of the Rectangle");
		Scanner num= new Scanner(System.in);
		System.out.println("Length: ");
		final double l= num.nextDouble();
		System.out.println("Width: ");
		final double w= num.nextDouble();
		double a= w*l;
		double p= 2* (l+w);
		System.out.printf("The Area is %.2f * %.2f= %.3f \n", l, w, a);
		System.out.printf("The Perimeter is 2* (%.2f + %.2f)= %.3f \n", l, w, p);
		

	}

}
