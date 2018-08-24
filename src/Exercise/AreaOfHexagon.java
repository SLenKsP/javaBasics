package Exercise;

import java.util.Scanner;

public class AreaOfHexagon {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the length: ");
		int n1= num.nextInt();
		double a= (6 * (n1*n1))/(4* Math.tan(Math.PI/6));
		System.out.println(a);

	}

}
