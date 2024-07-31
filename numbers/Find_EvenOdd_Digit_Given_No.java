package numbers;

import java.util.Scanner;

public class Find_EvenOdd_Digit_Given_No {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = sc.nextInt();
		
		int n2 = n, rem;
		while(n2 != 0) {
			 rem=n2%10;
			 
			 if(rem % 2 ==0 ) {
				 System.out.println("Even " + rem);
			 }
			 
			 else if(rem % 2 == 1 ) {
				 System.out.println("Odd " + rem);
			 }
			 
			 n2/=10;
		}

	}

}
