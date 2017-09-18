package Arrays;

public class removeDuplicates {
    public static void remove(int[] array){
    	int n = array.length;
    	int i = 0;
    	while (i < n){
    		boolean duplicate = doesArrayContainThisElement(array, i);
    		if (duplicate){
    			for (int j=i; j < n-1; j++){
    				array[j] = array[j+1];
    			}
    			n=n-1;
        		i=i-1;
    		}
    		i++;
    	}
    	  	for (int k = 0; k < n; k++){
            System.out.print(array[k] + " ");
    		
    	}
    }
	
   public static boolean doesArrayContainThisElement(int[] theArray, int index){
    	boolean theExist=false;
    	for (int j=0; j < (index); j++){
    		if (theArray[index]==theArray[j]){
    			theExist = true;
    		}
    	}
    	return theExist;
    }
    
   public static void main(String[] args){
	   int[] testArray={1,2,2,4,1,2,3,3,3,2,3,3,4,5,6,7,2,2,3,3,3,5,4,3,2,4,5,6,7,2,1,3,4,4,3,1,1};
		System.out.print("The array is: ");
		    for (int i=0; i < testArray.length; i++){
		    System.out.print(testArray[i] + " ");
		    }
		System.out.println();
	    System.out.print("The new array is: "  );
	    remove(testArray);
	  
			
   }
    
}
