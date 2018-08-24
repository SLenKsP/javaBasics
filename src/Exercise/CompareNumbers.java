package Exercise;

import java.util.Scanner;

public class CompareNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("First Number: ");
		int n1= num.nextInt();
		System.out.println("Second Number: ");
		int n2= num.nextInt();
		if(n1==n2)
		{
			System.out.println(n1+ " = "+n2);
		}
		if(n1!=n2)
		{
			System.out.println(n1+ " != "+n2);
		}
		if(n1<n2)
		{
			System.out.println(n1+ " < "+n2);
		}
		if(n1>n2)
		{
			System.out.println(n1+ " > "+n2);
		}
		if(n1<=n2)
		{
			System.out.println(n1+ " <= "+n2);
		}
		if(n1>=n2)
		{
			System.out.println(n1+ " >= "+n2);
		}
				

	}

}
