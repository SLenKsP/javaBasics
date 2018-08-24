package TestingLoops;

public class LocalVariable {
	public int z=20;
	private static int y;
	public static void main(String[] args) {
		LocalVariable ZZ= new LocalVariable();
		int zzz=ZZ.z;
		final int x=10;
		System.out.println(x);
		System.out.println(y);
		System.out.println(zzz);
	}
	
}
