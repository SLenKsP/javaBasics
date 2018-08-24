import java.util.Scanner;

public class doWhileLoop{
public static void printLine()	
	{
		int num=0;
		while(num<=50)
		{
			System.out.print("*");
			num++;
		}
		System.out.println(" ");
	}
	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		printLine();
		
		
		Scanner input= new Scanner(System.in);
		int inputNumber;
		do
		{
			System.out.println("Enter the number(Type -1 to exit): ");
			inputNumber= input.nextInt();
			if(inputNumber==-1)
			{
				System.out.println("Looks like you don't want to play!!!");
			}else if(inputNumber%2==0)
			{
				System.out.println("Entered number is even.");
			}else
			{
				System.out.println("Eneterd number is odd.");
			}
		}while(inputNumber!=-1);
		
		printLine();

	}
}
