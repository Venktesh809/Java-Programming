package numbers;

import java.util.Scanner;

public class LeapYear_OrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("enter the no ");
			int n = sc.nextInt();
			
			if(n % 4 == 0   ||  n % 400 == 0) {
				System.out.println("This is a Leap Year");
			}
	}

}
