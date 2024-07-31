package numbers;

import java.util.Scanner;

public class Spy_No {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = sc.nextInt();
		
		int n2=n, rem, sum=0, product=1;
		while(n2 != 0) {
			rem= n2%10;
			
			sum+=rem;
			product*=rem;
			
			n2/=10;
		}
		
		if(sum == product) {
			System.out.println("This is Spy no.");
		}
		else {
			System.out.println("not Spy no.");
		}
	}

}
