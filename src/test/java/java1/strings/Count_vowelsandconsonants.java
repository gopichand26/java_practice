package java1.strings;

public class Count_vowelsandconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Publicis Sapient 123#".toLowerCase();
		
		int consonants =0;
		int vowels = 0;
		
		for(char ch : s.toCharArray()) {
			
			if(Character.isAlphabetic(ch)) {
				if("aeiou".indexOf(ch) == -1) {
					consonants++;
				} else vowels++;
			} 
			
		}
		
		System.out.println("consonants are "+consonants+" and Vowels are "+vowels);
	}

}
