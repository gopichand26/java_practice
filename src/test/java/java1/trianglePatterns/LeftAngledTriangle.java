package java1.trianglePatterns;

public class LeftAngledTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		
		for(int i=n;i>=0;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
