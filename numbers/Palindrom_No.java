package numbers;

import java.util.Scanner;

public class Palindrom_No {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. ");
		int n = sc.nextInt();
		
		int n1 = n;
		int rem, product=0;
		while(n1 != 0) {
			rem = n1 % 10 ;
			product = product * 10 + rem ;
			n1/=10;
		}
		
		System.out.println(product); // reverse the no.
		
		if(n == product) {
			System.out.println("This is a palindrom no. ");
		}
		else
		{
			System.out.println("This is not a palindrom no.");
		}
	}
}
