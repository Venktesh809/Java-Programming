package Arrays;

import java.util.Scanner;

public class Right_To_Left_Rotate {

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
		
		System.out.println();
		System.out.println("Enter how many time to rotate ");
		int nth = sc.nextInt();
		
		for(int k=0; k<nth; k++) {
			
			
			int temp = ar[ar.length-1];      //we can use ar[size-1];
			for(int i=ar.length-1; i>0; i--) {
				ar[i] = ar[i-1];
			}
			ar[0] = temp;
			
		}
		
		for(int j:ar) {
			System.out.print(j+ "  ");
		}
		
	}

}
