package java1.strings;

import java.util.HashSet;
import java.util.Set;

public class find_substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcabd";
		int k = 2;
		
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0; i<=str.length()-k;i++) {
			
			String sub = str.substring(i,k+i);
			System.out.println(sub);
			set.add(sub);
			
		}
		
		System.out.println(set.size());
		
		
		
	}

}
