package academiajava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class Map1 {
	
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", Arrays.asList("1", "2"));
		
		
		System.out.println("A->" + map.get("A"));
		System.out.println("B->" + map.get("B"));
		
		System.out.println(map);
		
		map.clear();
		
		System.out.println(map);
		
		
		Hashtable<String, Object> map2 = new Hashtable<>();
		map2.put("A", "1");
		map2.put("B", Arrays.asList("1", "2"));
		
		System.out.println("3:" + map2.contains("3"));
		System.out.println("2:" +map2.contains("2"));
		System.out.println("1:"+ map2.contains("1"));
		System.out.println("22:" +map2.containsValue("2"));
		
		System.out.println("A:"+ map2.containsKey("A"));
		System.out.println("N:" + map2.containsKey("N"));
		
		System.out.println(map);
	}

}
