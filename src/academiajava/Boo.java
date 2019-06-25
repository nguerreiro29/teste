package academiajava;

public class Boo {
	
	public static void main(String[] args) {
		
		Boolean boolean1 = new Boolean (true);
		System.out.println(boolean1);
		
		Boolean boolean2 = new Boolean ("true");
		System.out.println(boolean2);
		
		Byte byte1 = new Byte ((byte)17); // é considerado sempre int
		System.out.println(byte1);
		
		Character ch = new Character ('N');
		System.out.println(ch);
		
		Double d = new Double (3.14);
		System.out.println(d);
		
		Float flo = new Float(1.4f);
		System.out.println(flo);
		
		Integer i = new Integer("128");
		System.out.println(i);
		
		Long l = new Long(1000);
		System.out.println(l);
		
		Double double1 = new Double(1.0);
		System.out.println(double1.byteValue());
		System.out.println(double1.floatValue());
		System.out.println(double1.intValue());
		System.out.println(double1.longValue());
		System.out.println(double1.shortValue());
		
	}

}
