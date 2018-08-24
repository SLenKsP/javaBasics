
public class StaticInstanceVariable {
	static int age= 31;
	String name= "Sagar";
	
	@SuppressWarnings("static-access")
	public static void familyInfo()
	{
		StaticInstanceVariable firstName= new StaticInstanceVariable();
		StaticInstanceVariable changeInAge= new StaticInstanceVariable();
		
		System.out.println("Name is: "+firstName.name);
		changeInAge.age= 32;
		System.out.println("Age is: "+age);
	}
	
	public static void main(String[] args) {
		familyInfo();


	}

}
