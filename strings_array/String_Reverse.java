package strings_array;

public class String_Reverse {

	public static void main(String[] args) {
			
		String s= "Venktesh Kumar Nirmalkar";
		String word[] = s.split(" ");
		
		String revString = " ";
		
		System.out.println(s);
		for(int i=0 ; i<word.length; i++)
		{
			String w = word[i];
			String revWord = " ";
			for(int j=w.length()-1; j>=0; j--) {
					
					 revWord = revWord + w.charAt(j);
			}
			
					revString = revString + revWord ;
		}
		
				System.out.println(revString);
				
	}

}
