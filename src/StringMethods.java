
public class StringMethods {

	public static void main(String[] args) {
		String Actual= "www.google.com";
		String expected="Www.google.com";
		if(Actual.startsWith("www")&& Actual.endsWith("com"))// startsWith and endsWith
			System.out.println("Test Passed");
		else
			System.out.println("Test failed");
		
		System.out.println(Actual.charAt(3));//charAt
		
		System.out.println(Actual.equals(expected));//equals case
		
		System.out.println(Actual.equalsIgnoreCase(expected));// equals ignore  case
		
		System.out.println(Actual.trim());//trim that clears white spaces at start and end of string
		
	}

}
