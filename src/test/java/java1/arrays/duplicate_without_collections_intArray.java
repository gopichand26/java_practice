package java1.arrays;

import java.util.stream.IntStream;

public class duplicate_without_collections_intArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,3,3,4,5,6,7,8,9,9};
		
		int uni[] = new int[a.length];
		
		for(int i=0; i<a.length;i++) {
			
			int num = a[i];
			
			
			boolean contains = IntStream.of(uni).anyMatch(x -> x == num);
			
			if(!contains) {
				
				uni[i] = num;
				
			} else {
				System.out.println(num);
			}
			
			
		}
		
		
		
	}

}
