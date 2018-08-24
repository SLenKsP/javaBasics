package Exercise;

import java.util.Scanner;

public class ReverseString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner stg= new Scanner(System.in);
		System.out.println("The imput String is: ");
		char[] s= stg.nextLine().toCharArray();
		System.out.println("Reverse String is: ");
		for(int i= s.length-1; i>=0; i--)
		{
			System.out.print(s[i]);
		}
		
	}

}
