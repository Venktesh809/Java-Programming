package Arrays;

import java.util.Scanner;

public class Left_To_Right_Rotate_Element {

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
	
		
		System.out.println("Enter how many time to rotate ");
		int nth = sc.nextInt();
		
		for(int k=0; k<nth; k++) {
			int temp = ar[0];
			
			for(int i=0; i<size-1; i++) {
				ar[i] = ar[i+1];
			}
			ar[size-1] = temp;
					
		}
		
		for(int j:ar) {
			System.out.print(j+ "  ");
		}
		
	}

}
