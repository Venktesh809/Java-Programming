package Arrays;

import java.util.Scanner;

public class SumOf_Even_Or_Odd_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of array");
		int size = sc.nextInt();
		
		int ar[] = new int [size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the value of index "+ i);
			ar[i] = sc.nextInt();
		}
		
			int sumEven = 0;
			int sumOdd = 0;
		for(int j=0; j<size; j++) {
			
			if(ar[j] % 2==0) {
				sumEven +=ar[j];
			}
			
			else if(ar[j] % 2==1) {
				sumOdd +=ar[j];
			}
		
		}
		
		
		System.out.println("sum of Even element is : "+ sumEven);
		System.out.println("sum of Odd element is : "+ sumOdd);
 	}

}
