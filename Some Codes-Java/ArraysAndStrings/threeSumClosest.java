package Arrays;

public class threeSumClosest {
	
	public static int sumClosest(int[] array, int target){
		int Sum = 0;
		double sumOld = Double.POSITIVE_INFINITY;
		double sumNew = 0;
		int n = array.length;
		int i = 0;
		while( i < n){
			int j = i+1;
			while (j < n){
				int tempSum = 0;
				for (int k = j+1; k < n; k++){
				tempSum = array[i] + array[j] + array[k];
				sumNew = Math.abs(tempSum - target);
				if (sumNew < sumOld){
					sumOld = sumNew;
					Sum = tempSum;
				 }
		       }
			   j++;
			}
			i++;
		}
		return Sum;
	}

	
	public static void main(String[] args){
		int[] theArray = {-3, 2, 1, -4, 0, 3};
		int theTarget = 1;
		double theSum = sumClosest(theArray, theTarget);
		System.out.println(theSum);
	}
}
