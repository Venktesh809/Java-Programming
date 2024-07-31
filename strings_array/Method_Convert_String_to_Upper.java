package strings_array;

public class Method_Convert_String_to_Upper {

	
	public static String uppr(String str) {
		
		String nst = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'a'	&&	ch<='z') {
				nst += (char) (ch - 32);
			}
			else {
				nst += (char) (ch - 32);
			}
		}
		
		return nst;
	}
	public static void main(String[] args) {
		
		System.out.println(uppr("venktesh"));
		System.out.println(uppr("domar"));
	}

}
