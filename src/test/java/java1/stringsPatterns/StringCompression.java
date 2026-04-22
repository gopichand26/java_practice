package java1.stringsPatterns;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbcdd";
		StringBuilder sb = new StringBuilder();
		int count = 1;
		
		for(int i=0;i<s.length();i++) {
			
			// if next char same as current, increase count
			if(i+1<s.length() && s.charAt(i) == s.charAt(i+1)) {
				count++;
			} else {
				// append current char + count
				sb.append(s.charAt(i)).append(count);
				count = 1;  // reset
			}
			
		}
		
		System.out.println(sb.toString());
	}

}
