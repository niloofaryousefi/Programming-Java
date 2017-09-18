package Arrays;

public class removeDuplicatesFromSorttedArray {

	public static void removeDuplicates(int[] array){
	int n = array.length;
	int i = 0;
	while (i <n){
		int k = 0;
		int j =i;
		while (array[j] == array[j+1]){
			k++;
			j++;
			
		}
		shiftLeft(array, j+1, k);
		i++;
		n = n - k;
	}
	for (int l = 0; l < n; l++){
		System.out.print(array[l] + " ");
	}
		
	}
	
	public static void shiftLeft(int[] array, int index, int value){
		int m = array.length;
		for (int i=index; i < m; i++){
			array[i-value] = array[i];
		}
	}	
	
	public static void main(String[] args){
		int[] testArray={1,2,2,2,3,3,4,5,7,7,7,8,9,9,15};
		System.out.print("The array is: ");
			    for (int i=0; i < testArray.length; i++){
			    System.out.print(testArray[i] + " ");
			    }
		System.out.println();
	    System.out.print("The unique array is: ");
		removeDuplicates(testArray);
		  
				
	   }
}
