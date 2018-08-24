package ConditionalExercise;

import java.util.Scanner;

public class VowelConsonant {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner c= new Scanner(System.in);
		System.out.println("Enter the alphabet(Capital or not capital- doesn't matter): ");
		String ch= c.next().toLowerCase();
		boolean UpperCase= ch.charAt(0)>=65 && ch.charAt(0)<=90;
		boolean LowerCase= ch.charAt(0)>=97 && ch.charAt(0)<=122;
		boolean vowel= ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u");
		if(ch.length()>1)
		{
			System.out.println("not a valid alphabet");
		}else if(!(UpperCase|| LowerCase))
		{
			System.out.println("Not a alphabet");
		}else if(vowel)
		{
			System.out.println("The entered alphabet is vowel.");
		}else
			System.out.println("The entered alphabet is consonant.");
		
		
	}

}
