package numbers;

import java.util.Scanner;

public class Power_of_No {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Base no. ");
		int b = sc.nextInt();
		
		System.out.println("enter the Power no. ");
		int p = sc.nextInt();
		
		int pwr = 1;
		for(int i=1; i<=p; i++) {
			pwr*=b;
		}
		
		System.out.println("Power is : " + pwr);
		
	}
}
