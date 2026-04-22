package java1.strings;

import java.util.LinkedList;
import java.util.List;

public class extract_numbers_total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a-12b34c-5d";
		List<Integer> numbers = new LinkedList<Integer>();
		int num = 0;
		Boolean inNumber = false;
		Boolean inNegative = false;
		int sum=0;
		
		for(int i =0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			
			// If it's a minus sign and next char is a digit → negative number starts
			if( ch =='-' && i+1 < s.length() && Character.isDigit(s.charAt(i+1))) {
				inNegative = true;
				continue;
			}
			
			if(Character.isDigit(ch)) {
				num = num*10+(ch-'0');
				inNumber = true;
			} else if(inNumber){
				// store the completed number
				numbers.add(inNegative?-num : num);
				//reset
				num = 0;
				inNumber = false;
				inNegative = false;
			}
			
		}
		
		// Handle last number if string ends with a number
		if(inNumber) {
			numbers.add(inNegative?-num : num);
			inNumber = false;
			
		}
		
		System.out.println(numbers);
		
		//count the total
		for(int i=0;i<numbers.size();i++) {
			sum = sum + numbers.get(i);
		}
		System.out.println(sum);
	}

}
