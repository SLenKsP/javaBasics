
public class UseOfContinue {

	public static void main(String[] args) {
		for(int i=65; i<=90;i++)
		{
			if(!(i%2==0))
			{
				continue;// this statement will skip all even numbers.
			}
			System.out.print((char)i+" ");
		}

	}

}
