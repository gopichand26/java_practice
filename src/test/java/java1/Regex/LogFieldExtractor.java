package java1.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogFieldExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "[2025-11-04 21:15:30] INFO: user=Gopi action=Login status=SUCCESS";
		
		Pattern pattern = Pattern.compile("(user|action|status)=([a-zA-z]+)");
		Matcher matcher = pattern.matcher(s);
		
		while(matcher.find()) {
			System.out.println(matcher.group(1)+"="+matcher.group(2));
		}
	}

}
