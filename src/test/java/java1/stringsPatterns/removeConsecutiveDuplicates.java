package java1.stringsPatterns;

import java.util.HashSet;
import java.util.Set;

public class removeConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aaabbcdd";
		
		Set<Character> set = new HashSet<Character>();
		StringBuilder sb1 = new StringBuilder();
		
		for(char ch : s.toCharArray()) {
			
			if(set.add(ch)) {
				sb1.append(ch);
			}
			
		}
		
		System.out.println(sb1);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(s.charAt(0));
		
		for(int i=1;i<s.length();i++) {
			
			if( s.charAt(i) != s.charAt(i-1)) {
				sb.append(s.charAt(i));
			}
			
		}
		
		System.out.println(sb.toString());

		
	}
}

