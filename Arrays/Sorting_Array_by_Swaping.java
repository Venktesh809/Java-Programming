package Arrays;

import java.util.Scanner;

public class Sorting_Array_by_Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int size = sc.nextInt();
		
		int ar[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the value of index "+i);
			ar[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<size; i++) {
			
			for(int j=i+1; j<size; j++) {
				
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		
		
		for(int j:ar) {
			System.out.print(j+ "  ");
		}

	}

}
