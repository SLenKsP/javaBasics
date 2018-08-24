package DataTypesExercise;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CurrentDateTime {

	public static void main(String[] args) {
		
		dateTime();		

	}
	public static void dateTime()
	{
		GregorianCalendar date= new GregorianCalendar();
		
		
		int day = date.get(Calendar.DAY_OF_MONTH);
		int month= date.get(Calendar.MONTH);
		int year= date.get(Calendar.YEAR);
		
		int second= date.get(Calendar.SECOND);
		int minute= date.get(Calendar.MINUTE);
		int hour= date.get(Calendar.HOUR);
		
		System.out.println("The Current Date is "+ day+ "/"+month+ "/"+year);
		System.out.println("The Current Time is "+ hour+":"+ minute+ ":"+second);
	}

}
