package ConditionalExercise;

import java.util.Scanner;

public class NTriangle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n1= num.nextInt();
		int k=1;
		for(int i=1; i<=n1;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(k++);// will print like 1\n 2 3\n 4 5 6\n 7 8 9 10
				//System.out.println(j);// will print like 1\n 1 2 \n 1 2 3
				//System.out.println(i);// Will print like 1\n 2 2\n 3 3 3
			}
			System.out.println(" ");
		}
		
	}

}