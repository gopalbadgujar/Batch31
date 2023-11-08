package javatypecasting;

public class DemoNarrowCasting {

	public static void main(String[] args) {
		
		double myDouble = 10.1234;
		
		int myInt = (int)myDouble;
		
		System.out.println(myDouble);
		System.out.println(myInt);
		
		short s = (short)myDouble;
		
		System.out.println(s);
		
		byte myByte = (byte) myDouble;
		System.out.println(myByte);
	}
}
