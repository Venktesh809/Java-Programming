package numbers;

public class ContFibonacciSeries {

	public static void main(String[] args) {
			
			int a1 = 0;
			int a2 = 1;
			int c = 0;
			int count =0;
			
			int m = 1;
			int n = 50;
			
			for(int i=m; i<= n; i++) {
					System.out.println(a1);
						count++;
						c = a1 + a2;
						a1 = a2;
						a2 = c;
			}
			System.out.println(count);
	}
}
