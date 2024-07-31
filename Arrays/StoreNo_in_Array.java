package Arrays;

import java.util.Scanner;

public class StoreNo_in_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array ");
		int lenth = sc.nextInt();
		
		int arr[] = new int[lenth];
		
		for(int i=0; i<lenth; i++) {
			System.out.println("Enter the value of index " +i);
			arr[i]=sc.nextInt();
		}
		
		for(int j:arr) {
			System.out.print(j+ " ");
		}
	}

}
