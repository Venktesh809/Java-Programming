package Arrays;

public class Add_TwoArray_WithIn_Array {

	public static void main(String[] args) {

		
		// ar1[][] 
//		int ar1[] = new int [4];
//		int ar2[] = new int [4];
//		
//		ar1[0] = 30;
//		ar1[1] = 40;
//		
//		ar2[0] = 50;
//		ar2[1] = 60;
		
		int ar1[] = {54,23,54,67,};
		int ar2[] = {28,45,6,23,12,43};
		
		int size = 0;
		
		if(ar1.length >= ar2.length){
			size = ar1.length;
			
			for(int i=0; i< size; i++) {
				if(i<ar2.length)
					ar1[i] += ar2[i];
			}
			
			for(int i:ar1) {
				System.out.println(i);
			}
		}
		else if(ar2.length > ar1.length){
			size = ar2.length;
			for(int i=0; i< size; i++) {
				if(i<ar1.length)
					ar2[i] += ar1[i];
			}
			for(int j:ar2) {
				System.out.println(j);
			}
		}
		
		
		
		
	//	first array element	
		
		
	//	second array element	
//		
		
//		int k = 2;
//		for(int i=0; i<ar2.length-2; i++) {
//			ar1[k++] = ar2[i]; 
//		}
		
	
	}

}
