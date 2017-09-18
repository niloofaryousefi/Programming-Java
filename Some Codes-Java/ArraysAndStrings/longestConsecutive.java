package Arrays;

public class longestConsecutive {
	public static int consecutive(int[] array){
		int n = array.length;
		int longestSequence = 1;
		for (int i = 0; i < n; i++){
			int k = 1;
			int j;
			int[] check = nextNumberExist(array, array[i]);
			while (check[0] == 1){
				k++;
		    j = check[1];
			check = nextNumberExist(array, array[j]);
			}
			if (k >= longestSequence){
				longestSequence = k;
			}
		}
		return longestSequence;
	}
	
	public static int[] nextNumberExist(int[] array, int value){
		int[] res = new int[2];
		int answer = 0;
		int indexNextNum = 0;
		int n = array.length;
		int i = 0;
		while (i < n && answer==0){
			if (array[i] == value+1){
				answer = 1;
				indexNextNum = i;
			}
			i++;
		}
		res[0] = answer;
		res[1] = indexNextNum;
		return res;
	}
	
	public static void main(String[] args){
		int[] testArray={132,1,130,125,4,1,6,1,5,100,127,7,133,2,126,128,4,5,8,129,131,3,134};
		System.out.print("The array is: ");
			    for (int i=0; i < testArray.length; i++){
			    System.out.print(testArray[i] + " ");
			    }
	    System.out.println();
		int answer = consecutive(testArray);
		      System.out.println("The answer is: "+ answer);
		  }

}
