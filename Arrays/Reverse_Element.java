package Arrays;

public class Reverse_Element {

	public static void main(String[] args) {

		int arr[] = {34, 20, 40, 25, 35, 10, 50,3};
		
		int k=arr.length-1, temp;
		
		for(int i=0; i<arr.length / 2 ; i++) {
				temp = arr[i];
				arr[i] = arr[k-i];
				arr[k-i] = temp; 
				
		}
		
		for(int j: arr) {
			System.out.println(j);
		}
		
		
	}

}
