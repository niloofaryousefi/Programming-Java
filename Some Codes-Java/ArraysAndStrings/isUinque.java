package ArraysAndStrings;

public class isUinque {
	
    public static boolean isItUnique(String str){
	int n = str.length();
	if(n > 256) return false;
	
	boolean[] char_set = new boolean[256];
	for(int i = 0; i < n; i++){
		int val = str.charAt(i);
		if(char_set[val]){
			return false;
		}
		char_set[val] = true;
	}
	 return true;	
	}

   public static void main(String[] args){
		String str_test = "Niloofar";
		System.out.println(isItUnique(str_test));
	
   }
}