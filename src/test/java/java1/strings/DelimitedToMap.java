package java1.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DelimitedToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "user:Gopi|role:SDET|project:Publicis|status:Active";
		String pairDelimiter = "\\|";
		String keyValueDelimiter = ":";
		
		Map<String, String> map = toMap(input, pairDelimiter, keyValueDelimiter );
		
		System.out.println(map);
	}

	private static Map<String, String> toMap(String input, String pairDelimiter, String keyValueDelimiter) {
		
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		for(String data : input.split(pairDelimiter)) {
			
			String keyValue[] = data.split(keyValueDelimiter);
			if(keyValue.length == 2) {
				map.put(keyValue[0].trim(), keyValue[1].trim());
			}
			
			
		}
		
		return map;
	}

}
