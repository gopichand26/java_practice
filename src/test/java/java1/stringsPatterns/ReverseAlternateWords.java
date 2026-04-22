package java1.stringsPatterns;

public class ReverseAlternateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am learning Java programming today";
		String words[] = s.split("\\s");
		String formatted ="";
		
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<words.length;i++) {
			String word = words[i];
			
			if(i%2!=0) {
				String reverse = new StringBuilder(word).reverse().toString();
				sb.append(reverse);
				
			
			} else {
				sb.append(word);
			}
			
			sb.append(" ");
			
			
		}
		
		System.out.println(sb);	
	}

}
