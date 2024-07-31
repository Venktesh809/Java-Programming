package Arrays;

import java.util.Scanner;

public class PrimeNo_in_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of Array");
		int size = sc.nextInt();
		
		int ar[] = new int [size];
		for(int i=0; i<ar.length; i++) {
			System.out.println("Enter the value of index "+ i);
			ar[i] = sc.nextInt();
		}
		
		for(int j=0; j<size; j++) {
			int count =0;
			for(int k=1; k<= ar[j]; k++) {
				
				if(ar[j] % k == 0) {
					count++;
				}
			}
			
			if(count == 2) {
				System.out.println("prime no is: "+ ar[j]);
			}
		}
	}
}
