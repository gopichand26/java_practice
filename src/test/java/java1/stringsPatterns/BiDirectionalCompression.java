package java1.stringsPatterns;

public class BiDirectionalCompression {
	
	static int count = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aaaabbccc";
		String s2 = "b1c4f5";
		
		System.out.println(transform(s1));
		System.out.println(transform(s2));
		
		
		
	}
	
	public static String transform(String input) {
		String s;
		
		if(input.matches(".*\\d.*")) {
			s = decompress(input);
		} else {
			s = compress(input);
		}
			
		
		return s;
		
	}

	private static String compress(String input) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<input.length();i++) {
			
			char ch = input.charAt(i);
			if(i+1<input.length() && input.charAt(i) == input.charAt(i+1)) {
				count++;
			} else {
				sb.append(ch).append(count);
				count = 1;
			}
			
		}
		
		return sb.toString();
	}

	private static String decompress(String input) {
		
		int count = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<input.length();i++) {
			
			
			if(Character.isLetter(input.charAt(i))) {
				
				count = input.charAt(i+1)-'0';
				for(int j=0;j<count;j++) {
					sb.append(input.charAt(i));
				}
				
			}
			
			
			
		}
		
		return sb.toString();
		// TODO Auto-generated method stub
		
	}

}
