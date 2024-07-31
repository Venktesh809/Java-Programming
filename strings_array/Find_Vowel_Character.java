package strings_array;

public class Find_Vowel_Character {

	public static void main(String[] args) {

			String st = "Domar sahu";
			System.out.println(st);
			
		for(int i=0; i<st.length(); i++) {
			char c = st.charAt(i);
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.println("vowel  " +c);
			}
		}
	}

}
