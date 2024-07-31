package Arrays;

import java.util.Scanner;

public class Check_Elem_Present_Array {

	public static void main(String[] args) {

		int arr [] = {23, 30, 40, 24, 35, 29};
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the element");
		int nth = sc.nextInt();
		
		int count = 0;
		for(int i: arr) {
			if(i == nth) {
				count++;
				System.out.println("elemnet is present " +i);
			}
		}
		
		if(count == 0) {
			System.out.println("Element is not present");
		}
	}

}
