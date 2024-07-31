package Arrays;

import java.util.Scanner;

public class Find_EvenOdd_in_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int size = sc.nextInt();
		
		int ar[] = new int [size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter value of index "+ i);
			ar[i] = sc.nextInt();
		}
		
		
		for(int k : ar) {
			if(k % 2==0) {
				System.out.println("even element "+ k);
			}
			else
			{
				System.out.println("odd element "+ k);
			}
		}
	}
}
