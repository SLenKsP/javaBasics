package Exercise;

import java.util.Scanner;

public class BinaryMath {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		long binary1, binary2;
		int i=0, remainder=0;
		int[] sum= new int[20];
		Scanner num= new Scanner(System.in);
		System.out.println("First number; ");
		binary1= num.nextLong();
		System.out.println("Second number;");
		binary2= num.nextLong();
		while(binary1 !=0 || binary2 !=0)
		{
			sum[i++]= (int)((binary1%10+binary2%10+remainder)%2);
			remainder= (int)((binary1%10+binary2%10+remainder)/2);
			binary1= binary1/10;
			binary2= binary2/10;
		}
		if(remainder!=0)
		{
			sum[i++]= remainder;
		}
		--i;
		System.out.println("The sum is: ");
		while(i>=0)
		{
			System.out.print(sum[i--]);
		}
			
	}

}

