package academiajava;

import java.util.List;
import java.util.ArrayList;

public class SimulaArrayIndexOutOfBoundsException {
	
	public static void main(String[] args) {
		List<String> array = new ArrayList<String>();
		array.add("Valor 001");
		array.add("Valor 002");
		array.add("Valor 003");
		array.add("Valor 004");
		array.add("Valor 005");
		
		try {
			array.get(-1);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Nao e possivel realizar a operacao");
		}
		
	}
}
