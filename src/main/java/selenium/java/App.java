package selenium.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		
		String s = "Gopichand";
		
		StringBuilder sb = new StringBuilder();
		Boolean flag = false;
		for(char ch : s.toCharArray()) {
			
			sb.append(flag?Character.toUpperCase(ch):Character.toLowerCase(ch));
			flag = !flag;
			sb.append(" ");
			
		}
		
		System.out.println(sb.toString());
		
	}
}
