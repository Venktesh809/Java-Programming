package numbers;

import java.util.Scanner;

public class Factors_of_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
	}

}
