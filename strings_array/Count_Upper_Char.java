package strings_array;

import java.util.Scanner;

public class Count_Upper_Char {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		int count =0;
		for(int i=0; i<st.length(); i++) {
			char c = st.charAt(i);
			
			if(c >= 'A'	&& c <= 'Z') {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
