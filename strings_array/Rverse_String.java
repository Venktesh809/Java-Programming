package strings_array;

import java.util.Scanner;

public class Rverse_String {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);
			String st = sc.nextLine();
			String str = "";
			
			for(int i=st.length()-1; i>=0; i--) {
				str = str + st.charAt(i);
			}
			System.out.println(str);
			
	}

}
