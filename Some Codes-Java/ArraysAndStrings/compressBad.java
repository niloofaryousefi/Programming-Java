package ArraysAndStrings;

public class compressBad {
	public static void compress(String s){
		int n = s.length();
		int i = 1;
		int unique_count = 1;
		while (i < n){
			if(s.charAt(i-1) != s.charAt(i)){
				unique_count++;
			}
			i++;
		}
	System.out.println(unique_count);
	}
	public static void main(String[] args){
		String str = "aaaabbbbccccaaabbddd";
		compress(str);
	}

}
