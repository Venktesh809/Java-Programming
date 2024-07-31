package numbers;

public class Fibonacci_Series_Range {

			public static void main(String[] args) {
				
					int a = 0;
					int b = 1;
					int c ;
					int count = 0;
					int nth = 10;
					
					for(int i=1; i<=10; i++) {
							count ++;
							if(count == nth ) {
							System.out.println(a);
							}
							c = a+b;
								a = b;
								b = c;
					}
					System.out.println(count);
					
			}
}
