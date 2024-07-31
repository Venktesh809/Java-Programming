package strings_array;

public class Count_a_in_your_clg_name {

	public static void main(String[] args) {

		String st = "Kruti Institute Of Technology Raipur";
		
		
		int count = 0 ;
		for(int i=0; i<st.length(); i++) {
			char c = st.charAt(i);
			
			if(c == 'a') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
