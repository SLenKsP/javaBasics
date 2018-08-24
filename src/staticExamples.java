
public class staticExamples {

	static int num;
	static String myStr;
	
	static {
		System.out.println("Block 1");
		num= 50;
		myStr= "Sagar Patel";
	}
	
	static {
		System.out.println("Block 2");
		num=100;
		myStr= "Monika Patel";
	}
	public static void main(String[] args) {
		
		System.out.println("Value of num: "+num);
		System.out.println("Name of String: "+myStr);
	}

}
