package Arrays;

public class Largest_Element {

	public static void main(String[] args) {
		
		int arr[] = {23, 49, 90 ,20, 8 };
		
		int larg = arr[0];
		for(int i:arr) {	
				if(i>larg) {
					larg = i ;
				}		
		}
		System.out.println(larg);
	}

}
