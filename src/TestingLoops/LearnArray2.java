package TestingLoops;


public class LearnArray2 {
	int x;
	double d;
	boolean b;
	String s;

	public static void main(String[] args) {
		String[]a= {"x","y","z"};
		args=a;
		for(String s:args)
		{
			System.out.println(s);
		}
		
		LearnArray2 t= new LearnArray2();
		System.out.println(t.x + "\n"+ t.d + "\n"+ t.b + "\n"+ t.s);
		
		

	}

}