package strings_array;

import java.util.Scanner;

public class Method_To_Count_Character {

	
	public static int length(String st) {
		
		int count = 0;
		char[] c = st.toCharArray();
		for(char i:c) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(length(s));
	}

}
