package numbers;

import java.util.Scanner;

public class Prime_No {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no ");
		int n = sc.nextInt();
		
		int count = 0;
		for (int i = 1; i<= n; i++) {
			
			if(n % i == 0) {
				count ++; 
			}
		}
		
		if(count == 2) {
			System.out.println(" this is prime no");
		}
		else {
			System.out.println(" not a prime no");
		}
		
	}

}
