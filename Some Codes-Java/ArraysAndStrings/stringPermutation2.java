package ArraysAndStrings;

public class stringPermutation2 {
	 public static boolean permutation(String s, String t){
		 if(s.length() != t.length()){ 
			 return false;
		 }
		 
		 int[] s_letters = new int[256];
		 char[] s_array = s.toCharArray();
		 for (char c: s_array){
			 s_letters[c]++;
		 }
		for(int i = 0; i <t.length(); i++){
			int c = (int) t.charAt(i);
			if(--s_letters[c] < 0){
				return false;
			}
		}
		return true;
	 }
 public static void main(String[] args){
	String s = "Niloofar";
	String t ="farNiloc";
	System.out.println(permutation(s,t));
 }
}
