package java1.stringsPatterns;

public class ReplaceAlternateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello world";
		String newWord = "";
		
		
		
		String words[] = s.split("\\s");
		StringBuilder sb = new StringBuilder();
		
		for(String word : words) {
			
			for(int i=0;i<word.length();i++) {
				
				if(i%2!=0) {
					sb.append('*');
				} else {
					sb.append(word.charAt(i));
				}
				
			}
			sb.append(" ");
			
		}

		
		System.out.println(sb);
	}

}
