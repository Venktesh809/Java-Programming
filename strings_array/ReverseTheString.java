package strings_array;

public class ReverseTheString {
	
public static void main(String[] args) {
		
		String s = "Venktesh Nirmalkar";
		
		String[] word = s.split(" ");
		System.out.println(word[0]);
		 System.out.println("given String is : "+s);
		String revString=" ";
		for(int i = 0 ; i<word.length; i++)
		{
			String w = word[i];
			String revWord = " ";
			
		
			for(int j = w.length()-1 ; j>=0 ; j--) 
			{
				revWord = revWord  + w.charAt(j);
			}
			
			revString = revString + revWord;
		}
		
		System.out.println(revString);
	}

}
