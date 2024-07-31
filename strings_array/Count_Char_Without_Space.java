package strings_array;

import java.util.Scanner;

public class Count_Char_Without_Space {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 String st = sc.nextLine();
		 int count =0;
		 
		 for(int i=0; i<st.length(); i++) {
			 char c = st.charAt(i);
			 
			 if(c != ' ')
			 {
				count++; 
			 }
		 }
		 
		 System.out.println(count);
	}

}
