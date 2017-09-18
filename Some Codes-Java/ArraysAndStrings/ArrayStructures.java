package Arrays;

public class ArrayStructures {
	private int[] theArray = new int[50];
	private int arraySize = 10;
	
	public void generateRandomArray(){
		
		for(int i=0; i < arraySize; i++){
			theArray[i] = (int) (Math.random()*10)+10;
		}
	}
	
	public void printArray(){
		System.out.println("----------");
		for (int i=0; i < arraySize; i++){
			System.out.print("|" + i + "| ");
			System.out.println(theArray[i] + "|");
			System.out.println("----------");
		}
	}
	
	public int getValueAtIndex(int index) {
		if (index < arraySize) return theArray[index];
		return 0;
	}
	
	public boolean doesArrayContainThisValue(int searchValue){
		boolean valueInArray = false;
		for (int i=0; i < arraySize; i++){
			if (theArray[i] == searchValue)
				valueInArray = true;
		}
		return valueInArray;
	}
	
	public void deleteIndex(int index){
		if (index < arraySize){
			for (int i=index; i < (arraySize-1); i++){
			theArray[i]=theArray[i+1];
			}
			arraySize--;
		}
			
	}
	
	public void insertValue(int value){
		if (arraySize < 50){
			theArray[arraySize] = value;
			arraySize++;
		}
	}
	
	public String linearSearchforValue(int value){
		boolean valueInArray = false;
		String indexswithValues ="";
		System.out.print("The Value was found in the following: ");
		
		for (int i = 0; i < arraySize; i++){
			if (theArray[i] == value){
				valueInArray = true;
				System.out.print(i + "");
				indexswithValues = indexswithValues + i;
			}
			
		}
		//System.out.println(indexswithValues);
		if (!valueInArray){
			indexswithValues = "None";
			System.out.println(indexswithValues);
		}
		System.out.println();
		return indexswithValues;
	}
	
	
	public void bubbleSort(){
		for (int i=(arraySize-1); i > 1; i--){
			for (int j=0; j < i; j++){
				if (theArray[j+1] < theArray [j]){
					swapValues(j, j+1);
				}
			}
			
		}
		
	}
	
	public void swapValues(int firstIndex, int secondIndex){
		int temp;
		temp = theArray[firstIndex];
		theArray[firstIndex] = theArray[secondIndex];
		theArray[secondIndex] = temp;
	}
	
	public void binarySearchForValue(int value){
		int lowIndex = 0;
		int highIndex = arraySize;
		
		while(lowIndex <= highIndex){
			int middleIndex = (lowIndex + highIndex) /2;
			if(theArray[middleIndex] > value)
				highIndex = middleIndex;
			else if (theArray[middleIndex] < value)
				lowIndex =middleIndex;
			else {
				System.out.println("Found a match for " + value + "at index " + middleIndex);
				lowIndex = highIndex + 1;
			}
			System.out.println();
		}
	}
	
	public void selectionSort(){
		for(int i=0; i < arraySize; i++){
			 int minimum = i;
			for(int j=i; j < arraySize; j++){
				if (theArray[j] < theArray[minimum]){
				minimum = j;
				}
			}
			swapValues(i,minimum);
		}
				
				
	}
	
	public void insertionSort(){
		for (int i=1; i < arraySize; i++){
			int j = i;
			int toInsert = theArray[i];
			while ((j > 0) && (theArray[j-1] > theArray[i])){
				 theArray[j] = theArray[j-1];
				 j--;
			}
		}
	}
	

	
	public static void main(String[] args){
		ArrayStructures newArray = new ArrayStructures();
		newArray.generateRandomArray();
		newArray.printArray();
		System.out.println(newArray.getValueAtIndex(8));
		System.out.println(newArray.doesArrayContainThisValue(5));
		newArray.deleteIndex(6);
		newArray.printArray();
		newArray.insertValue(55);
		newArray.printArray();
		newArray.linearSearchforValue(17);
		//newArray.bubbleSort();
		//newArray.printArray();
		//newArray.binarySearchForValue(11);
		newArray.insertionSort();
	    newArray.printArray();
	   
		
	}

}
