package ConditionalExercise;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		GregorianCalendar Cal= new GregorianCalendar();
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year= num.nextInt();
		if((year%4==0 && year%100!=0)|| (year%400==0))
		{
			System.out.println("Year is leap year");
		}else
			System.out.println("Year is not a leap year");
		
		int CurrentYear= Cal.get(Calendar.YEAR);
		System.out.println("Current Year is: "+ CurrentYear);
		if((CurrentYear%4==0 && CurrentYear%100!=0)|| (CurrentYear%400==0))
		{
			System.out.println("Current Year is leap year");
		}else
			System.out.println(CurrentYear+" is not a leap year");

	}

}
