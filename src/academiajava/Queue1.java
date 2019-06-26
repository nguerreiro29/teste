package academiajava;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args) {
		  Queue queue2 = new PriorityQueue<>(new Comparator<Pessoa>() {
		  
		  @Override 
		  public int compare(Pessoa o1, Pessoa o2) { return
		  o2.getIdade().compareTo(o1.getIdade()); 
		  } 
		});
		queue2.add(new Pessoa("Antonio", 32));
		queue2.add(new Pessoa("Fabio", 25));
		queue2.add(new Pessoa("Joao", 16));
		System.out.println(queue2.peek());  
		  
		Queue queue = new PriorityQueue<>();
		queue.add(new Pessoa("Antonio", 32));
		queue.add(new Pessoa("Fabio", 25));
		queue.add(new Pessoa("Joao", 16));
		
		System.out.println(queue.peek());
		
		ArrayDeque queue3 = new ArrayDeque<>();
		queue3.addFirst(new Pessoa("Antonio", 32));
		queue3.addFirst(new Pessoa("Fabio", 25));
		queue3.addFirst(new Pessoa("Joao", 16));
		queue3.add(new Pessoa("Jose", 32)); // metodo add chama o metodo addLast
		queue3.addLast(new Pessoa("Maria", 10));
		
		System.out.println(queue3.peek());
		System.out.println(queue3.getLast());
		System.out.println(queue3.getFirst());
		System.out.println(queue3);
}
}
