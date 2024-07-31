package numbers;

import java.util.Scanner;

public class Palindrom_No_From_GivenRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strating Range");
		int m = sc.nextInt();
		
		System.out.println("Enter Ending Range");
		int n = sc.nextInt();
		
		System.out.println("Enter nth no");
		int nt = sc.nextInt();
		
		int nth = nt ;
		int count = 0;
		
		
		for(int i= m; i<=n; i++) {
//			System.out.println(i);
			int org = i;
			int no = i;
			int rem=0;
			int rev=0;
			
			while(no!=0) {
				rem= no % 10;
				rev= rev *10 + rem;
				no/=10;
			}
			
			
			if(i == rev) {
				count++;
				
				if(count == nth) {
					System.out.println(rev);
				}
			
			}
		}
	}

}
