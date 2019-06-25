package academiajava;

import java.util.List;
import java.util.ArrayList;

public class Book {
	
	String isbn;
	
	public Book (String isbn) {
		this.isbn = isbn;
		
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Book book1 = new Book("12345");
		Book book2 = new Book("12345");
		System.out.println(book1.equals(book2)); //false (sem o metodo overide equals)pk estao a apontar para sitios diferentes, e esta a comparar os enderecos de memoria 
	
		List<Book> books = new ArrayList<>();
		books.add(new Book("a"));
		books.add(new Book("b"));
		
		for(int i = 0; i<books.size(); i++)
		{
			Book book = books.get(i);
			System.out.println(book.getIsbn());
		}
		
		for(Book book : books)
		{
			System.out.println(book.getIsbn());
		}
		
	
	
	}
	
}
