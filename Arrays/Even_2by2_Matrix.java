package Arrays;

public class Even_2by2_Matrix {

	public static void main(String[] args) {

		int arr[][] = new int [2][2];
		
		arr[0][0] = 39 ;
		arr[0][1] = 20;
		
		arr[1][0] = 29;
		arr[1][1] = 30;
		
		for(int []i:arr) {
			for(int j:i) {
				System.out.print(j+ "  ");
			}
			System.out.println();
		}
		
		
		for(int j[] : arr) {
			
			for(int k:j) {
				
				if(k % 2 ==0) {
					System.out.println("Even  " +k);
				}
			}
		}
 	}

}
