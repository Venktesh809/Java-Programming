package Arrays;

public class Count_No_of_Eelement {

	public static void main(String[] args) {

			int arr[] = { 23,45,42,39,30} ;
			int count =0;
		
			
	//		count array element without using length function		
			for(int i:arr) {
				count++;
				
			}
			System.out.println(count);
			
	//		count array element with the help of length		
			System.out.println(arr.length);
	}

}
