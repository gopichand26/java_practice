package java1.strings;

import java.util.Arrays;

public class practice_strings {
	
	public static void main(String args[]) {
		
		String s = "listen".replaceAll("\\s", "").toLowerCase();
		String s2 = "silent".replaceAll("\\s", "").toLowerCase();
		
		char[] sA = s.toCharArray();
		char[] s2A = s2.toCharArray();
		
		Arrays.sort(sA);
		Arrays.sort(s2A);
		
		if (Arrays.equals(sA, s2A)) {
		
			System.out.println("these are anagrams");
		}
		
	}

}
