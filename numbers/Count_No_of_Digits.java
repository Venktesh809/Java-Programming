package numbers;

import java.util.Scanner;

public class Count_No_of_Digits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the No ");
		int s1 = sc.nextInt();
		
		int count = 0;
		while(s1 !=0) {
			count++;
			s1/=10;
		}
		
		System.out.println(count);
	}
}	
