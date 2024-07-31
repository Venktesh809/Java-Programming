package strings_array;

import java.util.Scanner;

public class Count_Upp_Lowr_Digit_Special {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		int upr = 0;
		int lwr = 0;
		int spcl = 0;
		int dgt = 0;
		
		for(int i=0; i<st.length(); i++) {
			char c = st.charAt(i);
			
			
			if(c >= 'A' && c <= 'Z') {
				upr++;
			}
			else if(c >= 'a' && c <= 'z') {
				lwr++;
			}
			else if(c >= '0' && c <= '9') {
				dgt++;
			}
			else {
				spcl++;
			}
			
		}
		
		System.out.println("Upper character "+upr);
		System.out.println("Lower character "+lwr);
		System.out.println("Digit "+dgt);
		System.out.println("Special "+spcl);
				
	}

}
