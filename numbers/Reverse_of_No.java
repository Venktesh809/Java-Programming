package numbers;

import java.util.Scanner;

public class Reverse_of_No {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = sc.nextInt();
		
		int n2 = n;
		int rem, revs=0;
		while(n2 != 0) {
			rem = n2 % 10;
			revs=revs * 10 + rem;
			n2/=10;
		}
		System.out.println(revs);
	}

}
