
public class AdvanceCalc implements calc{

	int a, b, c;
	
	public static void main(String[] args) 
	{	
		AdvanceCalc obj= new AdvanceCalc();
		obj.add();
		
		

	}

	@Override
	public void add() 
	{
		AdvanceCalc obj= new AdvanceCalc();
		obj.a= 1;
		obj.b= 2;
		obj.c= obj.a+ obj.b;
		System.out.println(obj.c);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

}
