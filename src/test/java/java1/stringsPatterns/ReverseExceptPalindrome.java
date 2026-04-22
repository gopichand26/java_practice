package java1.stringsPatterns;

public class ReverseExceptPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "madam racecar level java spring";
		
		String words[] = input.split("\\s");
		
		StringBuilder sb = new StringBuilder();
		
		for(String word : words) {
			
			String reverseWord = new StringBuilder(word).reverse().toString();
			
			if(reverseWord.equals(word)) {
				sb.append(word);
			} else {
				sb.append(reverseWord);
			}
			
			sb.append(" ");
			
		}
		
		System.out.println(sb);
		
	}

}
