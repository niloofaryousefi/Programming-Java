package Arrays;

public class Solution {

	public static int[] removeElement(int[] nums, int val){
		int length = nums.length;
		for (int i=0; i < length-1; i++){
			while (nums[i] == val){
			   nums[i] = nums[i+1];
				length--;
				
			}
		}
		return nums;	
	}
	
	public static void main(String[] args){
	int[] theArray={1,2,2,3,2,3,3,4,5,6,7};
	System.out.print("The array is: ");
	    for (int i=0; i < theArray.length; i++){
	    System.out.print(theArray[i] + " ");
	    }
	    
	int[] newArray = removeElement(theArray,3);
	  System.out.println("The new array is: "  );
	    for (int i=0; i < newArray.length; i++){
		System.out.print(newArray[i] + " ");
		}
	}
}