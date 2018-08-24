package Exercise;

import java.util.Random;

public class RandomEvenOdd {

	public static void main(String[] args) {
		int n1, n2, n3, n4, n5, n6;
		int m1=0, m2=10, m3=20, m4=30, m5=40, m6=50;
		Random num= new Random();
		n1= num.nextInt(m2-m1)+m1;
		n2= num.nextInt(m3-m2)+m2;
		n3= num.nextInt(m4-m3)+m3;
		n4= num.nextInt(m5-m4)+m4;
		n5= num.nextInt(m6-m5)+m5;
		n6= n1+n2+n3+n4+n5;
		System.out.println("Entered numbers are:");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println("The Total of these numbers is "+n6);
		if(n6%2==0)
		{
			System.out.println("The Sum number is even");
		}else
			System.out.println("The Sum number is odd");

	}

}
