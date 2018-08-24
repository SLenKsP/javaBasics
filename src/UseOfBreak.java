
public class UseOfBreak {

	public static void main(String[] args) {
	for(int i=65; i<=122; i++)
	{
		if(i>=91 && i<=96)
		{
			continue;
		}
		System.out.println("This "+i+" represents "+ (char)i+ " in unicode");
			
	}
  }
}
