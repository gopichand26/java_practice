package java1.stringsPatterns;

public class ReverseInPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "abcdefg";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<input.length();i+=2) {
			
			char ch[] = input.toCharArray();
			if(i+1<input.length()) {
				sb.append(ch[i+1]).append(ch[i]);
			} else {
				sb.append(ch[i]);
			}
			
		}
		
		System.out.println(sb);
	}

}
