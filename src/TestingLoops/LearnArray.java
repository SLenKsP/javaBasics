package TestingLoops;

public class LearnArray {

	public static void main(String[] args) {
		/*int[] x= new int[4];
		System.out.println(x.length);// this will print length of variable x which is 4.
		//System.out.println(args.length);// print array length of array args which is 0 as it was not declared.
		
		int[] y= new int[3];// Error as negative value is not possible in array length.
		System.out.println(y.length);
		
		byte b= 10;
		int[] bb= new int[b];//byte value can be specified here as it is integer value.
		System.out.println(bb.length);
		
		char c= 'c';
		int[] cc= new int[c];// In int Array, char can be specified as it will represent value of character using unicode which is integer value.
		System.out.println(cc.length);
		
		short s= 30;
		int[] z = new int[s]; //Short value also can be specified in int array as it also represents integer value
		System.out.println(z.length);*/
		
		/*long l= 20l;
		int[] ll = new int[l];// Long value can not be specified in int as long cannot be converted to int
		System.out.println(ll.length);*/
		
		/*int[] p = new int[2147483647];//even though this number is in valid range, I got error as JVM does not have enough memory to support this much array length.
		System.out.println(p.length);*/
		
		/*int[] m= new int[3];
		m[0] = 'a';
		m[1] = 20;
		m[2] = 30;
		System.out.println(m[0]);// The out put will be some default value for the int array m for length of 3.
		System.out.println(m[1]);//By default every array value is 0. so output value for this array will be 0 as it is not specified here.
		System.out.println(m[2]);// Value of this array will be 30 as we specified. nn*/
		
		/*//Now 2-dimensional ex 1:
		int[][] t = new int[2][3];
		t[0][0]= 1;
		t[0][1]= 2;
		t[0][2]= 3;
		t[1][0]= 4;
		t[1][1]= 5;
		t[1][2]= 6;
		System.out.println(t);
		System.out.println(t[0]);
		System.out.println(t[0][0]);*/
		
		/*//Now 2-dimensional ex 2:
				int[][] t = new int[2][];
				t[0][0]= 1;
				t[0][1]= 2;
				t[0][2]= 3;
				t[1][0]= 4;
				t[1][1]= 5;
				t[1][2]= 6;
				System.out.println(t);
				System.out.println(t[0]);
				System.out.println(t[0][0]);*/
				
		/*// Single line array creation
				int[] u= {10,20,30};
				System.out.println(u[0]);
				
		// Single line array creation for 2 dimensional arrays
				int[][] v= {{10,20,30},{30,40,50}};
				System.out.println(v[1][2]);
				
		// Single line array creation in 3 dimensional arrays
				char[][][] w= {{{'A','B','C'},{'D','E','F'},{'G','H','I'}},{{'J','K'},{'L','M'}},{{'N','O','P'},{'Q','R','S'},{'T','U','V'},{'W','X','Y','Z'}}};
				System.out.println("Value of W is " + w[1][1][1]);
		int[] x= new int['c'];
		System.out.println(x.length);
		String s= "Sagar";
		System.out.println(s.length());
		String[][] SS= {{"Sagar","Monika"},{"Vristi","Dhristi"}};
		String S= "Sagar";*/
		int [][] a= new int[6][3];
		System.out.println(a.length);// length variable can be used to find out length of array. In Multidimensional array, length represents only base size but not total size
		System.out.println(a[1].length);
		/*System.out.println(S.length());// length() method returns number of characters present in the string array.
		System.out.println(SS[1][1].length());
		String[] X= {"A","AA","AAA"};
		System.out.println(X.length);
		System.out.println(X[0].length());
		System.out.println(X[1].length());*/
		
		int[] x= new int[] {10,20,30};
		System.out.println(x[0]+x[1]+x[2]);
	}

}
