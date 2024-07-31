package strings_array;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "Venktesh";
		String rev ="";
		
		for(int i=st.length()-1; i>=0; i--) {
			rev += st.charAt(i);
		}
		
		System.out.println(st);
		System.out.println(" Reverese String : " +rev);
	}

}
