package java1.stringsPatterns;

public class ZigZagMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abc"; 
		String s2 = "12345";
		
		
		StringBuilder sb = new StringBuilder();
		int len1 = s1.length();
		int len2 = s2.length();
		
		int maxLen = Math.max(len1, len2);
		for(int i=0;i<maxLen;i++) {
			
			if(i<len1) 
				sb.append(s1.charAt(i));
			
			
			if (i<len2)
				sb.append(s2.charAt(i));
			
			}
		
		System.out.println(sb);
	}

}
