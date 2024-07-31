package strings_array;

public class Count_Character {

	public static void main(String[] args) {

			String st = new String ("Venktesh Niramalkar") ;
			char st2[] = st.toCharArray();
			
			int count =0;
			for(char s:st2) {
				count++;
			}
			
			System.out.println(count);
	}

}
