package numbers;

import java.util.Scanner;

public class Perfect_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no. ");
		int n = sc.nextInt();
		
		int sum=0;
		for(int i=1; i<n; i++) {
			
			if(n % i==0) {
//				System.out.println(i);
				sum+=i;
			}
			
		}
		if(sum == n) {
			System.out.println("Perfect NO." + sum);
		}
		else
		{
			System.out.println("not perfect NO.");
		}
		
	}

}
