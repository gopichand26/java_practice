package java1.strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstWord = "egge"; 
		String secondWord = "adda";

		System.out.println(isIsomorphic(firstWord, secondWord));
	}

	public static boolean isIsomorphic(String firstWord, String secondWord) {

		Map<Character, Character> map = new HashMap<Character, Character>();

		if (firstWord.length() != secondWord.length()) {
			return false;
		}

		for (int i = 0; i < firstWord.length(); i++) {

			if (map.containsKey(firstWord.charAt(i))) {

				if (!map.get(firstWord.charAt(i)).equals(secondWord.charAt(i))) {

					return false;

				}

			} else {
				if (map.containsValue(secondWord.charAt(i))) {
					return false;
				}

				map.put(firstWord.charAt(i), secondWord.charAt(i));
			}
		}
		return true;
	}
}
