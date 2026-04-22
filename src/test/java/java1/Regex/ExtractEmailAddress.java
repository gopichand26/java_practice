package java1.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Please contact john.doe@gmail.com or jane_sapient@publicis.com for project updates.";
		
		
		Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
		Matcher matcher = pattern.matcher(s);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
