package academiajava;

public class Comparacao {
	
	public static void main(String[] args) {
		Pai obj1 = new Pai();
		Filho obj2 = new Filho();
		
		System.out.println("" + (obj1 instanceof Pai));
		System.out.println("" + (obj1 instanceof Filho));
		
		System.out.println("" + (obj2 instanceof Pai));
		System.out.println("" + (obj2 instanceof Filho));
		
		System.out.println("" + (obj1 instanceof Interface));
		System.out.println("" + (obj2 instanceof Interface));
	}
	
}
