package java1.stringsPatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerJavaSubstringComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "welcometojava";
		int k=3;
		
		SortedSet<String> set = new TreeSet<String>();
		
		
		for(int i=0;i<s.length()-k;i++) {
			
			
			set.add(s.substring(i,k+i));
			
		}
		
		
		System.out.println(set.first());
		System.out.println(set.last());
		
//		for(int i=0;i<list.size()-1;i++) {
//			num.add(list.get(i).compareTo(list.get(i+1)));
//		}
		
//		List<Integer> sortedNums = list.stream().map(s -> s.compareTo(s)).toList();
		
//		System.out.println(sortedNums.getFirst());
//		System.out.println(sortedNums.getLast());
//		System.out.println(list.size());
	}
	
	

}


