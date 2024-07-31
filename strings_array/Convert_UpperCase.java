package strings_array;

public class Convert_UpperCase {

	public static void main(String[] args) {
		
		String st = "Hello world";
		char st2 ;
		
		for(int i=0; i<=st.length()-1; i++) {
			st2 = st.charAt(i);
			
			if(st2>='a'  && st2<='z') {
				int l= st2 - 32 ;
				char up =(char) l;
				System.out.print(up);
			}
			else {
				System.out.print(st2);
			}
		}
		
		

	}

}
