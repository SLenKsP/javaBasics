package TestingLoops;

public class LearnInstanceVariable {
	int x=10;
	static int Y= 20;

	public static void main(String[] args) 
	{
		LearnInstanceVariable IV= new LearnInstanceVariable();	
		int C= IV.x +Y;
		System.out.println(IV.x);
		System.out.println(Y);
		System.out.println(C);
	}
}


