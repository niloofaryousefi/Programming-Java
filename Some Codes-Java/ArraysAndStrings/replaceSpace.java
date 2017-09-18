package ArraysAndStrings;

public class replaceSpace {
	public static void replace(String s){
		int n = s.length();
		int countSpaces = 0;
		for (int i = 0; i < n; i++){
			if (s.charAt(i) == ' '){
				countSpaces++;
			}
	}
		int newlength = n + countSpaces * 2;
		char[] s_array = new char[newlength];
		for (int i = n-1; i >= 0; i--){
			if(s.charAt(i) == ' '){
				s_array[newlength-1] = '0';
				s_array[newlength-2] = '2';
				s_array[newlength-3] = '%';
				newlength = newlength - 3;
				
			}else{
				s_array[newlength-1] = s.charAt(i);
				newlength = newlength - 1;
			}
		}
		System.out.println(s_array);
	}

 public static void main(String[] args){
	 String str = "Niloo far You se fi ";
	 replace(str);
	 
 }
}
