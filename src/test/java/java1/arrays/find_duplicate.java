package java1.arrays;

import java.util.Arrays;

public class find_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {1,1,2,3,4,4,4,5,6,7,7,8};
		
		Arrays.sort(numbers);
		
		for(int i =0; i<numbers.length-1; i++) {
			
			if(numbers[i] == numbers[i+1]) {
				System.out.println(numbers[i]);
			}

		}
		

	}

}
