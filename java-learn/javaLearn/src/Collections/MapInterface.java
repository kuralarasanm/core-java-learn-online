package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {
		// Map Interface - <key,value> pair
//			1.HashMap - non synchronized
//			2.HashTable - synchronized
//			3.TreeMap
		// right side Genetics is not important
		
		
//		<key,value> rules follow <set,List>
//		key is unordered
//		value is ordered
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("kural", 100);
		hashmap.put("raghul", 80);
		hashmap.put("don", 10);
		hashmap.put("murgan", 100);
		hashmap.put("kural", 97);
		hashmap.put(null, null);
		System.out.println("HashMap " + hashmap);
		System.out.println(hashmap.get("kural"));
		System.out.println("size "+hashmap.size());
		System.out.println("key "+hashmap.keySet());
		for(String key:hashmap.keySet()) {
			System.out.println(key+":"+hashmap.get(key));
		}
		System.out.println(hashmap.values());
		System.out.println(hashmap.containsKey("kural"));
		System.out.println(hashmap.containsValue(100));
		System.out.println("remove "+hashmap.remove("kural"));
		System.out.println(hashmap);
		
		System.out.println("---------------------------------------------");
		
		Map<String, Integer> hashtable = new Hashtable<String, Integer>();
		hashtable.put("kural", 100);
		hashtable.put("raghul", 80);
		hashtable.put("don", 10);
		hashtable.put("murgan", 100);
		hashtable.put("kural", 97);
//		hashtable.put(null, null); // error
		System.out.println("HashTable " + hashtable);
		System.out.println(hashtable.get("kural"));
		System.out.println("size "+hashtable.size());
		System.out.println("key "+hashtable.keySet());
		for(String key:hashtable.keySet()) {
			System.out.println(key+":"+hashtable.get(key));
		}
		System.out.println(hashtable.values());
		System.out.println(hashtable.containsKey("kural"));
		System.out.println(hashtable.containsValue(100));
		System.out.println("remove "+hashtable.remove("kural"));
		System.out.println(hashtable);
		
		System.out.println("-----------------------------------------");
//		key is ordered
//		value is unordered
		Map<String, Integer> treemap = new TreeMap<String, Integer>();
		treemap.put("kural", 100);
		treemap.put("raghul", 80);
		treemap.put("don", 10);
		treemap.put("murgan", 100);
		treemap.put("kural", 97);
		treemap.put("abc", 97);
//		treemap.put(null, null);//error

		System.out.println("TreeMap " + treemap);
	}
}
