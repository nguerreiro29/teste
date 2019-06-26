package academiajava;

import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayList1{
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(new Integer(1));
		list.add(2);
		System.out.println(list);
		
		List list2 = new ArrayList<>();
		list2.add(1);
		list2.add("N");
		list2.add("G");
		
		//Antes java 8
		
		  list2.forEach(new Consumer<Object>() {

			@Override
			public void accept(Object n) {
				System.out.println(n); } });
		
		  
		  
		//depois java 8
		list2.forEach((n)->System.out.println(n));
		
		list2.removeIf(n->(n instanceof String));
		System.out.println(list2);
		
		List list3 = new LinkedList<>();
		list3.add(1);
		list3.add("N");
		
		System.out.println(list3.contains("N"));
		System.out.println(list3.contains(1));
		System.out.println(list3.contains("A"));
		
		list3.remove(1);
		System.out.println(list3);
		
		System.out.println(list3.size());
		
		list.addAll(Arrays.asList(3,5,6));
		System.out.println(list);
		
		
		List vectorx = new Vector<>();
		vectorx.add(1);
		vectorx.add(4);
		System.out.println(vectorx);
		vectorx.clear();
		System.out.println(vectorx);
		
		System.out.println(vectorx.isEmpty());
		Object[] array = vectorx.toArray();
		System.out.println(Arrays.toString(array));
		
		Stack stack1 = new Stack();
		stack1.push(1);
		stack1.push("A");
		stack1.push("B");
		
		System.out.println(stack1);
		
		System.out.println(stack1.peek());
		
		System.out.println(stack1.pop());
		
		System.out.println(stack1);
		
		TreeSet set = new TreeSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		
		System.out.println(set.headSet(300));
		System.out.println(set.tailSet(300));
		System.out.println(set.subSet(300, 400));
	}

}
