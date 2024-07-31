package numbers;

import java.util.Scanner;

public class Find_Index_Fabinacci_Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter index no. ");
		int n = sc.nextInt();
		
		int a=0, b=1, k=n, x=0 ,c;
		
		int i=1;
		while(i<=k) {
			x = a;
			c = a + b;
			a=b;
			b=c;
			i++;
		}
		
		System.out.println(x);
	}
}
