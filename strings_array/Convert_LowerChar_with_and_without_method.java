package strings_array;

import java.util.Scanner;

public class Convert_LowerChar_with_and_without_method {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		String str =" ";
		for(int i=0; i<st.length(); i++) {
			char c = st.charAt(i);
			
			if(c >= 'A'  &&  c <= 'Z') {
				char ch = (char) (c + 32) ;
//				System.out.print(ch);
				str = str + ch;
			}
			else {
//				System.out.print(c);
				str = str + c;
			}
		}
		
		st = str;
//		st.toLowerCase();
		System.out.println(st);
	}
}
