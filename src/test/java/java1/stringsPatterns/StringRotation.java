package java1.stringsPatterns;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcd";
		String s2 = "cdab";
		if (s.length() != s2.length()) {
            System.out.println("Not string rotation (length mismatch)");
            return;
        } else 
        	if((s = s+s).contains(s2)) {
			System.out.println("s and s2 are string rotations");
		};
		
		
		

	}

}
