package java1.strings;

import org.testng.Assert;

public class NormalizeStringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String expected = "Publicis Sapient";
		String actual = "  publicis   sapient  ";
		
		
		Assert.assertEquals(formatted(expected), formatted(actual));
	}

	private static String formatted(String actual) {
		
		String formated = actual.trim().replaceAll("\\s+", " ").toLowerCase();
		
		
		return formated;
	}

}
