package java1.strings;

public class Reverse_words_without_stringbuilder {

	 public static void main(String[] args) {
		    String Input = "my name"; 
		    System.out.println(test(Input));
		    }
		    public static String test(String input) {
		        String Output="",s="";
		        for(int i=0;i<input.length();i++){
		            if(input.charAt(i) != ' '){
		                s = input.charAt(i)+s;
		            }
		            else{
		                Output = Output + " " + s; // " my name"
		                s = "";
		            }
		        }
		        Output = Output + " " + s;
		        return Output;   
		    }

}
