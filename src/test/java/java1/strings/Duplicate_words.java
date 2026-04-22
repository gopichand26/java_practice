package java1.strings;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is Jav!a a@nd JavaScript and fun";
		String[] words = s.toLowerCase().replaceAll("[^a-z\\s]","").split("\\s+");
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		for(String str : words) {
			
			map.put(str, map.getOrDefault(str, 0)+1);
			
		}
		
		System.out.println("The duplicate words are: ");
		for(Entry<String, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() == 1 ) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}

}
