package Arrays;

public class containDuplicateI {
	
	public static boolean doesThisArrayContainDuplicates(int[] array){
		boolean response = false;
		int n = array.length;
		int i = 0;
		while (!response){
			for(int j = i+1; j < n; j++){
				if (array[i] == array[j]){
					response = true;
				}
			}
			i++;
		}
		return response;
	}
	
	
	public static void main(String[] args){
		   int[] testArray={1,2,3,4};
			System.out.print("The array is: ");
			    for (int i=0; i < testArray.length; i++){
			    System.out.print(testArray[i] + " ");
			    }
		boolean answer = doesThisArrayContainDuplicates(testArray);
		//System.out.println();
		//System.out.println(answer);
		  
				
	   }

}
