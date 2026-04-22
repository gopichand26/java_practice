package java1.strings;

public class Count_Words_Without_Using_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Count Words Without Using split()";
		
		int wordCount = 0;
		
		Boolean inWord = false;
		
		
		for(char ch : s.toCharArray()) {
			
			if(ch!=' ' && !inWord) {
				inWord = true;
				wordCount++;
			} else if(ch == ' ') {
				inWord = false;
			}
			
		}
		
		System.out.println(wordCount);
		
	}

}
