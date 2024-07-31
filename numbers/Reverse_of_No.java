package numbers;

import java.util.Scanner;

public class Reverse_of_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = sc.nextInt();
		
		int n2 = n;
		int rem, revs=0;
		while(n2 != 0) {
			rem = n2 % 10;
			revs=revs * 10 + rem;
	
//			System.out.print(rem);		// direct reverse print
			n2/=10;
		}
		System.out.println(revs);
	}

}
