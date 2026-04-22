package java1.stringsPatterns;

public class StringDecompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a3b2c1d2";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			if (Character.isLetter(s.charAt(i))) {

				int count = s.charAt(i + 1) - '0';

				for (int j = 0; j < count; j++) {
					sb.append(s.charAt(i));
				}

			}

		}

		System.out.println(sb);
	}

}
