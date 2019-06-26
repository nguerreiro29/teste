package academiajava;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		int [] array = new int [5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		int [] array2 = new int [5];
		array2[0] = 5;
		array2[1] = 2;
		array2[2] = 3;
		array2[3] = 4;
		array2[4] = 5;
		
		int [] array3 = new int [5];
		
		Arrays.fill(array3, 0);
		
		Arrays.sort(array2);
		
		int [] newArray = Arrays.copyOfRange(array, 1, 3); //from e inclusivo to nao e
				
		/*
		 * for(i = 0; i<=array.length;i++) {
		 * 
		 * }
		 */
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.binarySearch(array, 3));
		System.out.println(Arrays.equals(array, array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(newArray));
		
	}
	

}
