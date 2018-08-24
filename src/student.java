
public class student {
	String name;
	int rollNumber;
	
	student(String name, int rollNumber)
	{
		this.name= name;
		this.rollNumber= rollNumber;
	}
	void studentInfo()
	{
		System.out.println("Name:" +name+ "|| rollNumber: "+rollNumber);
	}
	
public static void main(String[] args)
{
	student s1= new student("Sagar", 32);
	student s2= new student("Monika", 33);
	s1.studentInfo();
	s2.studentInfo();
	
}

}
