package numbers;

import java.util.Scanner;

public class Even_No {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. ");
		int n = sc.nextInt();
		
		if(n % 2==0) {
			System.out.println("This is Even no.");
		}
		else if(n % 2==1) {
			System.out.println("This is Odd no.");
		}
	}

}
