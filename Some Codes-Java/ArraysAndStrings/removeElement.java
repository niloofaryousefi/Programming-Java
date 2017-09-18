package Arrays;

public class removeElement {
	
	public static void removeValue(int[] array, int value){
		int n = array.length;
		int i =0;
		for (int j = 0; j < array.length; j++){
			if(array[j] != value){
				array [i] =array[j];
				i++;
			
			}else {
				n--;
			}
			}
		for (int k = 0; k < n; k++){
            System.out.print(array[k] + " ");
    		
    	}
}
		


   public static void main(String[] args){
	   int[] testArray={1,2,2,4,1,2,3,3,3,2,3,3,4,5,6,7,2,2,3,3,3,5,4,3,2,4,5,6,7,2,1,3,4,4,3,1,1};
		
	   int value = 3;
	  System.out.print("The array is: ");
		    for (int i=0; i < testArray.length; i++){
		    System.out.print(testArray[i] + " ");
		    }
		System.out.println();
	    System.out.print("The new array is: "  );
	    removeValue(testArray, value);
	  
			
}
}
