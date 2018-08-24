package DataTypesExercise;

import java.util.Scanner;

public class MinsToYearsAndDays {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double MinutesInYear= 60*24*365;
		Scanner min= new Scanner(System.in);
		System.out.println("Enter Minutes: ");
		long min2= min.nextLong();
		
		long Years= (long) (min2/MinutesInYear);
		int Days= (int) ((min2/60/24)%365);
		
		System.out.println((int)min2 +" minutes is approximately "+ Years + " years and " + Days+ "days." );

	}

}
