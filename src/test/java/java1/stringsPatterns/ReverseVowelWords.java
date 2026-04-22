package java1.stringsPatterns;

public class ReverseVowelWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "sky apple dry orange fly";

		String words[] = s.split("\\s");
		StringBuilder sb = new StringBuilder();
		String reverse = "";
		Boolean inVowel = false;

		for (String word : words) {

//			for (char ch : word.toCharArray()) {
//				if ("aeiou".indexOf(ch) != -1) {
//
//					inVowel = true;
//
//				} else {
//					inVowel = false;
//
//				}
//
//			}
			
			if(word.matches(".*[aeiouAEIOU].*")) {
				reverse = new StringBuilder(word).reverse().toString();
				sb.append(reverse);
			} else {
				sb.append(word);
			}
			
			sb.append(" ");

		}

		System.out.println(sb);

	}

}
