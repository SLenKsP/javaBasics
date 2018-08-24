package ConditionalExercise;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DaysInMonthOfYear {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		GregorianCalendar date= new GregorianCalendar();
		Scanner num= new Scanner(System.in);
		
		int days=0;
		String MonthName= "unknown";
		
		System.out.println("Enter the Month number: ");
		int Month= num.nextInt();
		
		System.out.println("Enter the Year: ");
		int Year= num.nextInt();
		
		switch(Month)
		{
		case 1: 
				MonthName= "January";
				days= 31;
				break;
		case 2: 
				MonthName= "February";
				
				if((Year%400==0)|| (Year%4==0 && Year%100!=0))
				{
					days= 29;
				}else
					days= 28;
				break;
		case 3: 
				MonthName= "March";
				days= 31;
				break;
		case 4: 
				MonthName= "April";
				days= 30;
				break;
		case 5: 
				MonthName= "May";
				days= 31;
				break;		
		case 6: 
				MonthName= "June";
				days= 30;
				break;
		case 7: 
				MonthName= "July";
				days= 31;
				break;
		case 8: 
				MonthName= "August";
				days= 31;
				break;
		case 9: 
				MonthName= "September";
				days= 30;
				break;
		case 10: 
				MonthName= "October";
				days= 31;
				break;
		case 11: 
				MonthName= "Novemner";
				days= 30;
				break;
		case 12: 
				MonthName= "December";
				days= 31;
				break;
				
		}
		if(Year>date.get(Calendar.YEAR))	
		{
			System.out.println(MonthName +", "+ Year+ " will have " + days+ " days.");
		}
		else if(Year==date.get(Calendar.YEAR))
		{
			System.out.println(MonthName +", "+ Year+ " has " + days+ " days.");
		}
		else
			System.out.println(MonthName +", "+ Year+ " had " + days+ " days.");
	}

}
