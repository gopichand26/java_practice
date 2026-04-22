package java1.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Pub44licis Sa-11pient wor44ks with Goo222gle and Microsoft on AI projects";
		
		Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-z0-9\\-]*[a-zA-z0-9\\-]*"); //\b -> word matches
		Matcher matcher = pattern.matcher(s);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
