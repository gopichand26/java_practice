package java1.strings;

public class HackerJavaStringsIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A = "paper";
		String B = "title";
	
		
		if(A.compareTo(B)>0) {
			System.out.println("Yes");
		} else System.out.println("No");
		
		//converting the first character only to uppercase and printing full Word
		System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
		
	}
	

}
