package java1.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LogKeyValueParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "status=success,code=200,message=Login successful,time=123ms";
		HashMap<String, String> map = new LinkedHashMap<String, String>();
		
		String words[] = s.split(",");
		
		for(String word : words) {
			
			String[]  keyValue = word.split("=");
			
			if(keyValue.length ==2) {
				map.put(keyValue[0], keyValue[1]);
			}
			
		
		}
		
		System.out.println(map);
		
	}

}
