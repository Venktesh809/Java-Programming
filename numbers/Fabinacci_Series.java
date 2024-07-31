package numbers;

import java.util.Scanner;

public class Fabinacci_Series {
	public static void main(String[] args) {
	
		int a = 0;
		int b = 1;
		
		for(int i=1; i<=10; i++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
		}
	}
}
