package numbers;

import java.util.Scanner;

public class Buzz_No {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			System.out.println("Enter the no ");
			int n = sc.nextInt();
			
			if(n % 7 ==0  || n % 10 == 7) {
				System.out.println("this is a buzz no");
			}
			else {
				System.out.println("Not a buzz no");
			}
	}

}
