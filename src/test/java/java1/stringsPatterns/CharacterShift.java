package java1.stringsPatterns;

public class CharacterShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abc xyz"; //bcd yza
		
		
		StringBuilder sb = new StringBuilder();
		
		for(char ch : s.toCharArray() ){
			
			if(Character.isLetter(ch)) {
				if(ch == 'z') ch='a';
				else if (ch=='Z') ch='A';
				else ch = (char)(ch+1);
			}
			
			sb.append(ch);
		}
		
		
		
		System.out.println(sb);
		
	}

}
