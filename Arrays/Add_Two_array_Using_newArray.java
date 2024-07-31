package Arrays;

public class Add_Two_array_Using_newArray {

	public static void main(String[] args) {

		int ar1[] = {12, 32, 42, 54, 87};
		int ar2[] = {20, 57, 24, 23};
		
		int size = 0;
		if(ar1.length > ar2.length) {
				size = ar1.length;
		}
		else if(ar2.length > ar1.length){
			size = ar2.length ;
		}
		else if(ar1.length == ar2.length){
			size = ar1.length;
		}
		
		System.out.println(size);
		int ar3[] = new int[size];
		int indx=0;
		int temp;
//		
//		for(int i=0; i<ar1.length; i++) {
//			ar3[indx++] = ar1[i];
//		}
//		for(int j=0; j<ar2.length; j++) {
//			ar3[indx++] = ar2[j];
//		}
		
		
		for(int i=0; i< ar3.length-1 ; i++) {
			 temp = ar1[i] + ar2[i];	 
			 ar3[i] = temp;
		}
		
		
		for(int k:ar3) {
			System.out.println(k);
		}
	}

}
