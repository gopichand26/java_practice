package java1.Regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumNumbersRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s = "12av10a-10adf-10.5ggf23.5";
		
		Double sum = 0.0;
		
		Pattern pattern = Pattern.compile("\\-?\\d+(\\.\\d+)?");
		Matcher matcher = pattern.matcher(s);
		
		while(matcher.find()) {
			System.out.println(matcher.group()); 
			
			sum = sum + Double.parseDouble(matcher.group());
		}
		
		System.out.println(sum);
		
	}

}
