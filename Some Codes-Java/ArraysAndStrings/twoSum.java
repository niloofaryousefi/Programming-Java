package Arrays;

public class twoSum {
	public static void ifTheSumAddsUptoThisValue(int[] array, int value){
		for(int i = 0; i < array.length; i++){
			for(int j = i+1; j < array.length; j++){
				int sum = array[i] + array[j];
				if ( sum == value){
				System.out.println("------");
				System.out.println(i + "|" + j + "|");
				}
			}
		}
	}
  
	  public static void main(String[] args){
		   int[] testArray={1,2,2,4,1,2,3,3,3,2,3,3,4,5,6,7,2,2,3,3,3,5,4,3,2,4,5,6,7,2,1,3,4,4,3,1,1};
		   int value = 11;
		  System.out.print("The array is: ");
			    for (int i=0; i < testArray.length; i++){
			    System.out.print(testArray[i] + " ");
			    }
			System.out.println();
			ifTheSumAddsUptoThisValue(testArray, value);
		  
				
	}
}
