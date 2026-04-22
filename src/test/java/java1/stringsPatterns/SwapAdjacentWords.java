package java1.stringsPatterns;

public class SwapAdjacentWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am learning Java Today";
		
		String[] words = s.split("\\s");
		StringBuilder sb = new StringBuilder();
	
		for(int i=0;i<words.length;i+=2) {
			
			if(i+1<words.length) {
				sb.append(words[i+1]).append(" ").append(words[i]).append(" ");
			} else {
				sb.append(words[i]);
			}
	
		}

		
		System.out.println(sb.toString());
		
	}
	

}
