package java1.arrays;

import java.util.Arrays;

public class find_duplicates_string_array_without_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s = {"a", "b", "c", "d", "d"};
		String[] dup = new String[s.length];
		
		for(int i =0; i<s.length; i++) {
			
			String word = s[i];
			
			boolean flag = Arrays.stream(dup).anyMatch(a -> a == word);
			
			if(!flag) {
				dup[i] = word;
			} else {
				System.out.println(word);
			}
			
		}
		

	}

}
