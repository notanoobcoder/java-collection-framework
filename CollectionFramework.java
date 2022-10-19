import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CollectionFramework {
//always use parameterized types for collection framework
	public static void main(String[] args) {
		
		/*ARRAY LIST*/
		
		ArrayList<String> words = new ArrayList<String>();
		/*Faster for retrieval, slower for manipulation*/
		//Adding items
		words.add("Hello"); words.add("there"); words.add("sir"); words.add("69"); words.add("420");
		//size --> words.size()
		
		//Removing items
		words.remove(1);
		//System.out.println(words);
		System.out.println(words.get(0) + " " + words.get(1));
		
		for(String value : words) {
			System.out.println(value + " " + "okay");
		}
		
		/*LINKED LIST*/
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		/*Slower for retrieval, faster for manipulation*/
		for(int i = 0; i < 10; i++) {
			ll.add(i*10);
		}
		
		ll.remove(2);
		ll.remove();//null --> removes the first data in the list
		ll.remove();
		
		System.out.println(ll);
		
		/*SET DS*/
		/*HASH SET*/ //Unordered
		
		HashSet<Integer> val = new HashSet<Integer>();
		val.add(12);
		val.add(43);
		val.add(67);
		val.add(100);
		val.add(12);
		val.add(67);
		
		System.out.println(val);//unsorted hashset
		
		List<Integer> list = new ArrayList<Integer>(val);
		Collections.sort(list);
		
		System.out.println(list);//sortedhashset
		
		/*LINKED HASH SET*/ //Ordered
		
		LinkedHashSet<Integer> val1 = new LinkedHashSet<Integer>();
		val1.add(12);
		val1.add(43);
		val1.add(67);
		val1.add(100);
		val1.add(12);
		val1.add(67);
		
		//val1.clear();
		
		 
		boolean has = val1.contains(67);
		
		System.out.println(has);
		System.out.println(val1);
		
		/*HASH MAP*/ //Unordered 
		
		HashMap<String, String> dictionary = new HashMap<String, String>(); //two data types <K, V>
		//entry sets
		dictionary.put("Red", "a bright color somewhat resembling a tomato.");
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary.put("Confidence", "the feeling or belief that one can have faith in or rely on someone or something.");
		
		for(String word: dictionary.keySet()) {
			System.out.println(word);
		}
		
		for(String values: dictionary.values()) {
			System.out.println(values);
		}
		
		/*LINKED HASH MAP*/ //Ordered 
		
		LinkedHashMap<String, String> dictionary1 = new LinkedHashMap<String, String>(); //two data types <K, V>
		//entry sets
		dictionary1.put("Red", "a bright color somewhat resembling a tomato.");
		dictionary1.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary1.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary1.put("Confidence", "the feeling or belief that one can have faith in or rely on someone or something.");
		
		for(String word1: dictionary1.keySet()) {
			System.out.println(word1);
		}
		
		for(String values1: dictionary1.values()) {
			System.out.println(values1);
		}
		
		//displaying both keys and values
		System.out.println(dictionary1);//method 1
		
		for(Map.Entry<String, String> entry: dictionary.entrySet()) {
			System.out.println(entry);//method 2
		}
		
		/*TREE MAP*/ //Displays the keys in natural order (numerically/lexicographically) 
		
		TreeMap<String, String> tree = new TreeMap<String, String>(); //two data types <K, V>
		//entry sets
		tree.put("Brave", "null");
		tree.put("Red", "a bright color somewhat resembling a tomato.");
		tree.put("Brave", "ready to face and endure danger or pain; showing courage.");
		tree.put("Joy", "a feeling of great pleasure and happiness.");
		tree.put("Confidence", "the feeling or belief that one can have faith in or rely on someone or something.");
		
		for(String word: tree.keySet()) {
			System.out.println(word);
		}
		
		for(String values: tree.values()) {
			System.out.println(values);
		}
		
		System.out.println(tree);
		
	}

}
