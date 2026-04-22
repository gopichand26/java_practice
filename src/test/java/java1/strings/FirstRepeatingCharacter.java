package java1.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdbbce".toLowerCase();
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(char ch : s.toCharArray()) {
			if(Character.isAlphabetic(ch)) {
				if(!set.add(ch)) {
					System.out.println("The FirstRepeatingCharacter is "+ch);
					break;
				}
			}
		}
		
	}

}
