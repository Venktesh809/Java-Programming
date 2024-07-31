package Arrays;

import java.util.Scanner;

public class Merge_2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of 1st array");
		int size = sc.nextInt();
		
		int ar1[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the value of index "+ i);
			ar1[i] = sc.nextInt();
		}
		
		
		
		System.out.println();
		System.out.println("Enter the length of 2nd array");
		int size2 = sc.nextInt();
		
		int ar2[] = new int[size2];
		
		for(int i=0; i<size2; i++) {
			System.out.println("Enter the value of index "+ i);
			ar2[i] = sc.nextInt();
		}
		
		
		int ar3[] = new int[ar1.length + ar2.length];

		int k=0;
		for(int i=0; i<ar1.length; i++) {
			ar3[k++] = ar1[i];
		}
		
		for(int i=0; i<ar2.length; i++) {
			ar3[k++] = ar2[i];
		}
		
		
		for(int j:ar3) {
			System.out.print(j+ " ");
		}
	}

}
