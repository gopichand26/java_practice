package java1.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAmounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "transaction1: amount=250, transaction2: amount=450, transaction3: amount=1000";
		
		Pattern pattern = Pattern.compile("amount=(\\d+)");
		Matcher matcher = pattern.matcher(s);
		
		while(matcher.find()) {
			System.out.println(matcher.group(1));
		}
	}

}
