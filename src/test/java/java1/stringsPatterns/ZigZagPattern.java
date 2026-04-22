package java1.stringsPatterns;

public class ZigZagPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "sapient";
		
		Boolean flag = true;
		StringBuilder sb = new StringBuilder();
		
		for(char ch : word.toCharArray()) {
			
			if(flag) {
				ch = Character.toUpperCase(ch);
				sb.append(ch);
			} else if(!flag){
				ch = Character.toLowerCase(ch);
				sb.append(ch);
			}
			
			sb.append(" ");
			flag = !flag;
			
		}
		
		System.out.println(sb);
		
	}

}
