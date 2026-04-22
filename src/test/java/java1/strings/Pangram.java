package java1.strings;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "The quick brown fox jumps over the lazy dog".toLowerCase().replaceAll("\\s+", "");
		
		Set<Character> set = new HashSet<Character>();
		
		for(char ch : s.toCharArray()) {
			
			set.add(ch);
		}
		
		System.out.println(set);
		
		if(set.size() == 26) {
			System.out.println("this is a pangram");
		} else {
			System.out.println("not a pangram");
		}
		
	}

}
