package strings_array;

import java.util.Scanner;

public class Store_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of String array");
		int size = sc.nextInt();
		
		String st[] = new String[size];
		
		for(int i=0; i<size; i++) {
			st[i] = sc.next();
		}
		
		for(String j:st) {
			System.out.println(j);
		}
		
	}

}
