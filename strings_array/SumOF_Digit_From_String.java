package strings_array;

import java.util.Scanner;

public class SumOF_Digit_From_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		int sum = 0;
		
		for(int i=0; i<st.length(); i++) {
			char c = st.charAt(i);
			
			if(c >= '0' && c <= '9') {
				sum += c - 48 ;
			}
		}
		
		System.out.println(sum);
	}

}
