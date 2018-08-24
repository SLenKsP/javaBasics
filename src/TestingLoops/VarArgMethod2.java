/*------------------------------
 * sum of the var-args method
code starts:
package TestingLoops;

public class VarArgMethod2 {

	public static void main(String[] args) 
	{
		Sum();
		Sum(10,20);
		Sum(10,20,30);
		Sum(10,20,30,40);	
	}
	public static void Sum(int...x) 
	{	
		int total=0;
		for(int x1:x)
		{
			total=total+x1;
		}
		System.out.println("The Total: " +total);
	}
}
Code ends 
----------------------------------*/
/* --------------------------------
 * general and var-arg method
Code Starts:

package TestingLoops;

public class VarArgMethod2 
{
	public static  void m1(int...x)
	{
		System.out.println("Var-arg Method");
	}
	public static void m1(int x)
	{
		System.out.println("General Method");
	}
	public static void main(String[] args)
	{
		m1();//value of x is not defined so it will be considered as var-arg
		m1(10,20);//more than 1 value is defined so again considered as var-arg
		m1(10);// one value is defined which matches both method but this time general method will be called because it has higher priority 
				  over var-arg method.(we can say that general method was implemented way before var-arg method :)  
	}
}
Code ends
-------------------------------------*/
/*--------------------------------
 //* replacing String[] args) can be replaced with (String... args 
//Code Starts:
package TestingLoops;

public class VarArgMethod2 
{
	public static void m1(int...x)
	{
		System.out.println("The number is ");
	}
	public static void main(String... args)// (String[] args) can be replaced with (String... args) however,opposite is not possible
	{
		m1(new int[]{10});
		m1(new int[]{10,20});
		m1(new int[]{10,20,30,40});
		
	}
}
//Code ends
//-------------------------------------*/

/*
Examples:
m1(int...x)- We call this method by passing group of int values and x will become 1 dimensional array
m1(int[]...x)- x will become 2 dimensional array
m1(int[][]...x)- x will become 3-dimensional array
*/

package TestingLoops;

public class VarArgMethod2 
{
	public static void m1(int[]...x)
	{
		for(int[] x1:x)
		{
			System.out.println(x1[0]);
		}
	}
	public static void main(String... args)
	{
		int[] a= {10,20,30};
		int[] b= {40,50,60};
		m1(a,b);	
	}
}






















































