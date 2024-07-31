package Arrays;

import java.util.Scanner;

public class Duplicate_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int size = sc.nextInt();
		
		int ar[] = new int [size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the value of index "+ i);
				ar[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				
				if(ar[i] == ar[j]) {
					System.out.println("Duplicate Element : "+ar[i]);
				}
			}
		}

	}

}
