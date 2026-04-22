package java1.stringsPatterns;

public class SwapFirstLastLettersEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "gopi chand puttha";
	
		String[] words = sentence.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(String word : words) {
		
			String first = word.substring(0,1);
			String last = word.substring(word.length()-1);
			String middle = word.substring(1,word.length()-1);
//			System.out.println(middle);
			sb.append(last).append(middle).append(first).append(" ");
		}
		
		System.out.println(sb);
		
	}

	

}
