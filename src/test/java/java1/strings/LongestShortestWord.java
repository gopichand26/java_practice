package java1.strings;

public class LongestShortestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Publicis Sapient is hiring";
		String[] words = s.split(" ");
		String longestWord = words[0];
		String smallestWord = words[0];
		
		for(String word : words) {
			
			if(word.length() > longestWord.length()) {
				longestWord = word;
			}
			
			if(word.length()<smallestWord.length()) {
				smallestWord = word;
			}
			
		}
		
		System.out.println(longestWord+"-"+smallestWord);
	}

}
