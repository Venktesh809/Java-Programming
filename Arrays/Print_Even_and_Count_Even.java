package Arrays;

public class Print_Even_and_Count_Even {

	public static void main(String[] args) {

			int arr [] = {22, 45, 69, 60, 20};
			int count = 0 ;
			
			for(int i:arr) {
				if(i % 2 == 0) {
					count++;
					System.out.println(i);
				}
			}
			
			System.out.println("No of Even Element " +count);
	}

}
