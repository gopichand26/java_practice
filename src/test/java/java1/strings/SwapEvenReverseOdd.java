package java1.strings;

public class SwapEvenReverseOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "I love india so much";
		String words[] = sentence.split("\\s+");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			
			if(i%2==0) { // even index → swap first & last
				sb.append(swap(word));
			} else {
				sb.append(new StringBuilder(word).reverse()); // odd index → reverse
			}
			
			sb.append(" ");
		}
		
		System.out.println(sb.toString().trim());
	}

	private static String swap(String word) {
		StringBuilder sb = new StringBuilder(word.length());
		if(word.length()<=1)  return word;
		
		sb.append(word.charAt(word.length()-1)); //last char
		sb.append(word,1,word.length()-1); //middle part
		sb.append(word.charAt(0)); //first char
		
		return sb.toString().trim();
	}
}
