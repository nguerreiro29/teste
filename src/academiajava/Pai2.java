package academiajava;

import java.util.Arrays;

public class Pai2 implements Comparable<Pai2>{

	private Integer id;
	private Integer idade;
	
	public Pai2(Integer id) {
		super();
		this.id = id;
		this.idade = idade;
	}
	
	public Integer getId() {
		return id;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void serId(Integer id) {
		this.id = id;
	}
	
	public void serIdade(Integer idade) {
		this.idade = idade;
	}
	
	@Override
	public int compareTo(Pai2 otherPai) {
		return id.compareTo(otherPai.getId());
	}
	
	@Override
	public String toString() {
		return "Pai2 [id=" + id + "]";
	}
	
	public static void main(String[] args) {
		Pai2 [] array = new Pai2[5];
		array[0] = new Pai2(5);
		array[1] = new Pai2(2);
		array[2] = new Pai2(35);
		array[3] = new Pai2(4);
		array[4] = new Pai2(5);
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
	}

}
