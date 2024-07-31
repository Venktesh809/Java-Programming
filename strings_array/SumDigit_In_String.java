package strings_array;

public class SumDigit_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "Hello@123" ;
		int sum=0;
		
		for(int i=0; i<=st.length()-1; i++) {
			
			char c= st.charAt(i);
			
			if(c>='0' && c<='9') {
				char s = (char) (c + 48);
				sum = (s) ;
				System.out.println(sum );
			}
			
			
		}
		

	}

}
