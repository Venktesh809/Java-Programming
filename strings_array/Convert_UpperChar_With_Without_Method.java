package strings_array;

import java.util.Scanner;

public class Convert_UpperChar_With_Without_Method {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String str ="";
		
		for(int i=0; i<st.length(); i++) {
			char ch = st.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				char c = (char) (ch - 32);
				
				str = str + c;
				
			}
			
			else {
				str = str + ch;
				
			}
		}
		st = str ;
		
		String str1 = st.toUpperCase();
		
		System.out.println(st);
		System.out.println(str1);
	}

}
