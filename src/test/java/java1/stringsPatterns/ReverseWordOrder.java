package java1.stringsPatterns; 

public class ReverseWordOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I love Java programming";
		
		String words[] = s.split("\\s");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=words.length-1; i>=0;i--) {
			
			String word = words[i];
			sb.append(word).append(" ");
			
		}
	System.out.println(sb.toString().trim());
	}
	

}
