package java1.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "User{id=1,name=Gopi} User{id=2,name=Chand} User{id=3,name=Puttha}";
		
		Pattern pattern = Pattern.compile("User\\{.*?\\}");
		Matcher matcher = pattern.matcher(s);
		
		List<String> result = new ArrayList<String>();
		
		while(matcher.find()) {
			result.add(matcher.group());
		}
		
		System.out.println(result);
	}

}
