package numbers;

import java.util.Scanner;

public class Strong_No {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no. ");
		int n = sc.nextInt();
		
		int s1 =n;
		int rem ;
		int sum =0;
		while(s1 !=0) {
			rem = s1%10;
			
			int fac=1;
			for(int i=1; i<=rem; i++) {
				fac*=i;
			}
			sum += fac ; 
			
			s1/=10;
		}
		if(sum == n) {
			System.out.println("Strong no.");
		}
		else
		{
			System.out.println("Not a Strong no.");
		}
		
	}

}
