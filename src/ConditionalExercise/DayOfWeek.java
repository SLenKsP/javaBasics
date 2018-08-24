package ConditionalExercise;

import java.util.Scanner;

public class DayOfWeek {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter number between 1 and 7:- ");
		int weekday= num.nextInt();
		String day = null;
		switch(weekday)
		{
			case 1: day= "Monday";
					break;
			case 2: day= "Tuesday";
					break;
			case 3: day= "Wednesday";
					break;
			case 4: day= "Thursday";
					break;
			case 5: day= "Friday";
					break;
			case 6: day= "Saturday";
					break;
			case 7: day= "Sunday";
					break;
			default: day= "Not a Valid Week Day Number";
		}
		System.out.println("The day of the week is: "+ day);
	}

}
