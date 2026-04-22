package java1.stringsPatterns;

public class Reverse_Only_MiddlePart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "programming";
		
		StringBuilder sb = new StringBuilder();
		
		String subWord = word.substring(1,word.length()-1);
		
		sb.append(word.charAt(0)).append(new StringBuilder(subWord).reverse().toString())
		.append(word.charAt(word.length()-1));
		
		System.out.println(sb);
		
	}

}
