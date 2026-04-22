package java1.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "listen".replaceAll("\\s", "").toLowerCase();
		String s2 = "silent".replaceAll("\\s", "").toLowerCase();
		
		if (s.length() != s2.length()) {
            System.out.println("Not anagram (length mismatch)");
            return;
        }
		
		
		char[] ch = s.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		
		Arrays.sort(ch);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch, ch2)) {
			System.out.println("Both are anagram");
		} else System.out.println("not anagram");

	}

}
