package java1.stringsPatterns;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Gopi";
		String s2 = "rar";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			rev = rev + s.charAt(i);
			
		}
		
		System.out.println(rev);
		
		//check Palindrome
		
		String sb = new StringBuilder(s2).reverse().toString();
		
		System.out.println(sb);
		
		if(sb.equals(s2)) {
			System.out.println("This is a palindrome");
		} else {
			System.out.println("not palindrome");
		}
		
	}

}
