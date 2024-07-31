package numbers;

import java.util.Scanner;

public class ArmStrong_No {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no. ");
		int n = sc.nextInt();
		
		int n2=n, n3 = n;
		
		int cont=0;
		while(n2 !=0) {
			cont++;
			n2/=10;
		}
		
		int rem;
		int sum=0;
		while(n3 !=0) {
			rem = n3%10;
			
			int pwr=1;
			for(int i=1; i<=cont; i++) {
				pwr*=rem;
			}
			
			sum +=pwr;
			n3/=10;
			
			
		}
//		System.out.println(sum);
		if(sum == n) {
			System.out.println("this is ArmStrong no. ");
		}
		else {
			System.out.println("not ArmStrong no.");
		}
		
	}

}
