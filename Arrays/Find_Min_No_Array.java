package Arrays;

import java.util.Scanner;

public class Find_Min_No_Array {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of array");
		int size = sc.nextInt();
		
		int ar[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the value of index "+ i);
			ar[i] = sc.nextInt();
		}
		
		
		int min = ar[0];
		for(int i=0; i<size; i++) {
			
			if(ar[i] < min) {
				min = ar[i];
			}
		}
		
		System.out.println("Minimum no. is "+ min);
	}

}
