package ArraysAndStrings;

public class reverseString {
	 

	public static void reverse(String str){
	int n  = str.length();
	char[] strReverse = new char[n];
	for (int i = 0; i < n; i++){
		strReverse[i] = str.charAt(n-1-i);
	}
	System.out.println(new String(strReverse));
 }
	public static void main(String[] args){
		String theStr = "Niloofar Yousefi";
		System.out.println(theStr);
		System.out.println();
		reverse(theStr);
		
    }
	

}
