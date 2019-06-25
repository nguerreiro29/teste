package academiajava;

public class Book {
	
	String isbn;
	
	public Book (String isbn) {
		this.isbn = isbn;
		
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("12345");
		Book book2 = new Book("12345");
		System.out.println(book1.equals(book2));
	}
	

}
