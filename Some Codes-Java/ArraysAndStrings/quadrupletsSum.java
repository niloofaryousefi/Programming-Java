package Arrays;

public class quadrupletsSum {
	public static void quadSum(int[] array, int target){
		int n = array.length;
		for (int i = 0; i < n; i++){
			for(int j =1; j < n; j++){
				for(int k = 2; k < n; k++){
					for(int l = 3; l < n; l++){
						if (array[i]+array[j]+array[k]+array[l] == target){
							System.out.print(array[i] + " " + array[j] + " " + array[k] + " " + array[l]);
							System.out.println();
						}
						
					}
				}
			}
		}
	}

	public static void main(String[] args){
		int[] testArray={1,0,-1,0,-2,-2};
		System.out.print("The array is: ");
			    for (int i=0; i < testArray.length; i++){
			    System.out.print(testArray[i] + " ");
			    }
		System.out.println();
	    //System.out.print("The unique array is: ");
	    quadSum(testArray, 0);
		  
				
	   }
}
