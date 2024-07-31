package strings_array;

public class Reverse_All_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String s = new String("My Name Is Java");
		String rev="";
		String tmp ="" ;
		for(int i=0; i<s.length(); i++) {
			
			tmp = tmp + s.charAt(i);
			 
			if(s.charAt(i) == ' ') {
				rev = tmp + rev;
				tmp = "" ;
			}
			
			if(i == s.length() -1) {
				tmp = tmp+ ' ';
				rev = tmp+rev;
				tmp = "";
			}
		 }
		
		System.out.println(rev);

	}

}
