package TestingLoops;

public class ComboSVAndIV {
	static int x=10;
	int y=20;
	public static void main(String[] args) {
		ComboSVAndIV Combo= new ComboSVAndIV();
		ComboSVAndIV.x= 222;
		Combo.y= 333;
		ComboSVAndIV T2= new ComboSVAndIV();
		ComboSVAndIV.x=555;
		System.out.println(x + "....." + T2.y); //for static int x, you can use either x or ComboSVAndIV.x or T2.x

	}

}
