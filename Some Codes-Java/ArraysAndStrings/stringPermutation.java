package ArraysAndStrings;

public class stringPermutation {
		
	public static  String sortString(String str){
		char[] strArray = str.toCharArray();
		java.util.Arrays.sort(strArray);
		return new String(strArray);
	}
	
	public static boolean compareString (String s , String t){
		if (s.length() != t.length()){
			return false;
		}
		
		return sortString(s).equals(sortString(t));
	}

	public static void main(String[] args){
		String str1 = "Niloofar";
		String str2 = "iofarNlo";
		boolean answer = compareString (str1, str2);
		System.out.println(answer);
	
		
	}
	
}
