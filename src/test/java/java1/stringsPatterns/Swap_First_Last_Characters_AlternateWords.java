package java1.stringsPatterns;

public class Swap_First_Last_Characters_AlternateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java coding is awesome and powerful";
		
		String words[] = s.split("\\s");
		String newWord ="";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<words.length;i++) {
			
			if(i%2 == 0) {
				
				String word = words[i];
				
				String first = word.substring(0,1);
				String last = word.substring(word.length()-1);
				String middle = word.substring(1,word.length()-1);
				
				newWord = last+middle+first;
				sb.append(newWord);
			} else sb.append(words[i]);
			
			sb.append(" ");
			
		}
		
		System.out.println(sb.toString());
		
	}

}
