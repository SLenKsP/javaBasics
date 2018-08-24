package Exercise;

import java.util.Scanner;

public class DistanceCalc {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("The Lat of coordinate 1 is: ");
		double l1= num.nextDouble();
		System.out.println("The Long of coordinate 1 is: ");
		double lo1= num.nextDouble();
		System.out.println("The Lat of coordinate 2 is: ");
		double l2= num.nextDouble();
		System.out.println("The long of coordinate 2 is: ");
		double lo2= num.nextDouble();
		System.out.print("The distance between those two coordinates is: "+distance_Between_LatLong(l1, lo1, l2, lo2)+ "km\n");	
	}
	public static double distance_Between_LatLong(double l1, double lo1, double l2, double lo2)
	{
		l1=  Math.toRadians(l1);
		lo1= Math.toRadians(lo1);
		l2= Math.toRadians(l2);
		lo2 = Math.toRadians(lo2);
		
		double R= 6371.01;
		return  R* Math.acos(Math.sin(l1)*Math.sin(l2)+ Math.cos(l1)* Math.cos(l2)* Math.cos(lo1-lo2));
		
	}
}
