package academiajava;

public class ValueOf {
	
	public static void main(String[] args) {
		System.out.println(Boolean.valueOf(true));
		System.out.println(Boolean.valueOf("true"));
		
		Integer i = new Integer(125);
		Integer j = i;
		System.out.println(i == j);
		i++;
		j++;
		System.out.println(j==i);
		
	}

}
