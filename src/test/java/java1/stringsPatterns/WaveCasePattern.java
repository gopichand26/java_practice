package java1.stringsPatterns;

public class WaveCasePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="testing wave pattern";
		Boolean makeUpper = true;
		StringBuilder result = new StringBuilder();
		
		for(char ch : s.toCharArray()) {
			
			if(Character.isLetter(ch)) {
				result.append(makeUpper?Character.toUpperCase(ch):Character.toLowerCase(ch));
				makeUpper=!makeUpper;
			} else {
				result.append(ch);
			}
			
		}
		
		System.out.println(result.toString());
		
		
		
//		StringBuilder sb = new StringBuilder();
//		String words[] = s.split("\\s");
//		for(int i=0;i<words.length;i++) {
//			
//			String word = words[i];
//			
//			for(int j=0;j<word.length();j+=2) {
//				if(j+1 == word.length()) {
//					String capitalLetter = word.substring(j,word.length()).toUpperCase();
//					sb.append(capitalLetter);
//				} else {
//				String capitalLetter = word.substring(j,j+1).toUpperCase();
//				sb.append(capitalLetter).append(word.charAt(j+1));
//				}
//			} sb.append(" ");
//			
//		}
		
		
	}

}
