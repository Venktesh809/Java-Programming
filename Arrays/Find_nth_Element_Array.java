package Arrays;

import java.util.Scanner;

public class Find_nth_Element_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		System.out.println("Enter nth element");
		int nth = sc.nextInt();
		
		System.out.println("Enter the array element");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
	//		find element in array present or not 
/*		for(int j:arr) {
			if(j == nth) {
				System.out.println(j);
			}
			
		}
*/  
		
		
		
//		find element of nth index  		
		for(int j=1; j<=size; j++) {	// star 1 because compare the nth (count)
			
			if(j==nth) {
				System.out.println(arr[j-1]);	// [j-1] because array always start storing 0 index 
			}
			
		}
		
		
		
		
		
	}

}
