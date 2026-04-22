package java1.strings;

public class validateEmail {
	
	public static void main(String args[]) {
		
		String email = "adsf@gmail.com";
		
		for (int i = 0; i < email.length()-1; i++)
        {
			String str = email.substring(i, 1);

            if (str.indexOf('@') == -1)
            {
              System.out.println("It is not a valid email");
            }
            else
            {
            	System.out.println("It is valid email");
            }
            
        }
		
	}

}