package java1.strings;

import java.util.Map;

public class MapComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> expected = Map.of(
				"status","success",
				"code","200",
				"message", "Login Successful"
				);
		
		Map<String, String> actual = Map.of(
				"status","success",
				"code","200",
				"message", "Login Successful"
				);
		
		System.out.println(isMapEqual(expected, actual));
				
	}

	private static boolean isMapEqual(Map<String, String> expected, Map<String, String> actual) {
		
		for(String key : expected.keySet()) {
			
			if(!actual.containsKey(key)) {
				System.out.println("Key is not present");
				return false;
			} else if (!expected.get(key).equals(actual.get(key))) {
				System.out.println("value is not present");
				return false;
			} 
			
		}
		return true;
		
	}

}
