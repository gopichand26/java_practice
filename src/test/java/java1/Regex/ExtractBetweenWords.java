package java1.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractBetweenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "log start This is the message content end of line";
		
		Pattern pattern = Pattern.compile("(start)(.*)(end)");
		
		Matcher matcher = pattern.matcher(s);
		
		while(matcher.find()) {
			System.out.println(matcher.group(2).trim());
		}
	}

}
