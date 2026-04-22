package java1.stringsPatterns;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Publicis Sapient is hiring";
		
		String[] sArray = s.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(String str : sArray) {
			
			String reverse = new StringBuilder(str).reverse().toString();
			sb.append(reverse+" ");
			
		}
		
		System.out.println(sb.toString());
		
	}

}
