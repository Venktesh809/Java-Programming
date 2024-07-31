package Arrays;

import java.util.Scanner;

public class Sum_Element {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			int size = sc.nextInt();
			int sum = 0;
			
			int ar[] = new int [size];
			
			for(int i=0; i<ar.length; i++) {
				ar[i] = sc.nextInt();
				sum = sum + ar[i] ;
			}
			
			System.out.println(sum);
			
	}

}
