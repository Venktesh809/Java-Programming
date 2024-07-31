package numbers;

import java.util.Scanner;

public class Special_no {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = sc.nextInt();
		
		int n2=n;
		int rem, sum=0;
		while(n2 !=0) {
			rem=n2%10;
			
			int fact=1;
			for(int i=1; i<=rem; i++) {
				fact*=i;
			}
			sum+=fact;
			n2/=10;
		}
		
		if(n == sum) {
			System.out.println("this is special no. ");
		}
		else {
			System.out.println("not a special no.");
		}

	}

}
