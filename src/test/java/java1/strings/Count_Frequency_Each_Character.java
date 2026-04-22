package java1.strings;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Count_Frequency_Each_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdbbce".toLowerCase();
		StringBuilder sb = new StringBuilder();
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char ch : s.toCharArray()) {
			if(Character.isAlphabetic(ch)) {
				map.put(ch, map.getOrDefault(ch, 0)+1);
			} 
			
			
		}
		
		List<Integer> list = map.values().stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());	
		
		int second = list.get(1);
		for(Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() >0) {
				System.out.println(entry.getKey()+"->"+entry.getValue());
				sb.append(entry.getKey()).append(entry.getValue()); // String Compression
			}
			
		}
		
		System.out.println(sb.toString()); // printing String compression
	}

}
