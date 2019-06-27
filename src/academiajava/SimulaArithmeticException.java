package academiajava;

public class SimulaArithmeticException {
	
	public static void main(String[] args) {
		int valor1 = 10;
		int valor2 = 0;
		
		try {
			System.out.println(valor1/valor2);
		}
		catch (ArithmeticException e){
			System.out.println("Nao e possivel realizar a operacao");
		}
		
		
		
	}

}
