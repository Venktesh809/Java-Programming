package Arrays;

import java.util.Scanner;

public class Find_Max_No_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of Array");
		int size = sc.nextInt();
		
		int ar[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the value of index "+ i);
			ar[i] = sc.nextInt();
		}
		
		int max=ar[0];
		for(int i=0; i<size; i++) {
				 
				if(ar[i] > max) {
				  	max = ar[i];

			}
		}
		
		System.out.println("Max no is : "+max);

	}

}
