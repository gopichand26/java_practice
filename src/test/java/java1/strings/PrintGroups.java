package java1.strings;

public class PrintGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabbbccdaa";
		
		groups(s);
	}

	private static void groups(String s) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		sb.append(s.charAt(0));

		
		for(int i=1;i<s.length();i++) {
			
			if(s.charAt(i) == s.charAt(i-1)) {
				sb.append(s.charAt(i));
				count++;
			} else {
				System.out.println(s.charAt(i-1)+":"+count); // print Count Group Frequencies
				System.out.println(sb.toString()); //print groups
				count =1;
				sb.setLength(0);
				sb.append(s.charAt(i));
			}
			
		}
		
		System.out.println(s.charAt(s.length()-1)+":"+count); // print last Count Group Frequencies
		System.out.println(sb.toString()); // print last group
	}

}
