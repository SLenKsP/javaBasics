package stringExercises;

import java.util.Scanner;

import org.testng.annotations.Test;

public class GetCharAtIndex 
{
	@Test
	public void getChar()
	{
		Scanner char1= new Scanner(System.in);
		System.out.println("Enter the String:");
		
		String s1= char1.nextLine();
		
		int totalLength= s1.length();
		
		System.out.println("Total length of the sting is: "+ (totalLength-1));
		
		System.out.println("Enter the number: ");
		
		int i1= char1.nextInt();
		
		char c1= s1.charAt(i1-1);
		
		System.out.println("The character at enetered index is: "+ c1);
	}

}
