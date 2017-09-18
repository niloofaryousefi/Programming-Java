package Arrays;

public class findDuplicate {
	public static int duplicate(int[] array){
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++){
			int k = 0;
			int j = i+1;
			while(k == 0 && j < n){
				if (array[i] == array[j]){
					 temp = array[i];
					k++;
				}
				j++;
			}
		}
	return temp;	
	}

	
	public static void main(String[] args){
		int[] testArray={2,1,1,4,1,6,1};
		System.out.print("The array is: ");
			    for (int i=0; i < testArray.length; i++){
			    System.out.print(testArray[i] + " ");
			    }
	    System.out.println();
		int answer = duplicate(testArray);
		      System.out.println(answer);
		  
				
	   }
}
