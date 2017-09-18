package Arrays;

public class CombinationSum {
	public static void combination(int numofNums, int sum){
		int[] array = new int[numofNums];
		for (int i = 0; i < array.length; i++){
			array[i] = 9;
		}
	
		for (int k = 0; k < array.length; k++){
	while( array[k] > 1){
		 array [k] = array[k] - 1;
		int	 arraySum = 0;
		for (int j = 0; j < array.length; j++){
		arraySum = arraySum + array[j];
		}
   if (arraySum == sum){
	   for (int i=0; i < array.length; i++){
		    System.out.print(array[i] + " ");
		    }
   }
	}
		}		
	}
	
	public static void main(String[] args){
		  combination(4,15);
				
	   }

}
