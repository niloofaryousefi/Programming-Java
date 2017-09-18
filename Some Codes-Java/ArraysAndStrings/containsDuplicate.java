package Arrays;

public class containsDuplicate {
	public static void containDuplicates(int[] array, int value){
		int n = array.length;
		for (int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				int k = Math.abs(i-j);
				if (array[i] == array[j] && k <= value){
					System.out.println("------");
					System.out.println(i +  " | " + j +  " | " + k);
					System.out.println(array[i] + " " + "| " + array[j] + " " +" | ");
				}
				
			}
		}
		
	}
	 
	   public static void main(String[] args){
		   int[] testArray={1,2,2,4,1,2,3,3,3,2,3,3,4,5,6,7,2,2,3,3,3,5,4,3,2,4,5,6,7,2,1,3,4,4,3,1,1};
		   int value = 4;
		   System.out.print("The array is: ");
			    for (int i=0; i < testArray.length; i++){
			    System.out.print(testArray[i] + " ");
			    }
			System.out.println();
			containDuplicates(testArray, value);
		  
				
	   }

}
