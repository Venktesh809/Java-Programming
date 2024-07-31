package numbers;

import java.util.Scanner;

public class PrimeNo_GivenRange {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Give Starting range ");
		int s1 = sc.nextInt();
		
		System.out.println("Give Ending range ");
		int e1 = sc.nextInt();
		
		
		int count=0;
		int j=0;
		int i=0;
		for(i=s1; i<=e1; i++) {
				count=0;
			for(j=1; j<=i; j++) {
				
				if(i%j == 0) {
					count++;
				}
//				System.out.println("cont" + count);
			}
			if(count == 2) {
				System.out.println("prime no." + i);
			}
		}
		
			
	}

}
