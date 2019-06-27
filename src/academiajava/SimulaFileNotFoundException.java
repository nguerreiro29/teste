package academiajava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SimulaFileNotFoundException {
	
	/*
	 * public static void main(String[] args) { 
	 * 
	 * BufferedReader br = null;
	 * 
	 * try { 
	 * br = new BufferedReader(new FileReader("/tmp/arq.txt")); } 
	 * catch(FileNotFoundException e)
	 *  // e.printStackTrace();
	 *
	 * { System.out.println("Ficheiro nao encontrado"); } 
	 * }
	 */
	
	
	  public static void main(String[] args) throws FileNotFoundException { 
	  
	  BufferedReader br = null;
	 
	  br = new BufferedReader(new FileReader("/tmp/arq.txt")); } 
	  
	 
}
