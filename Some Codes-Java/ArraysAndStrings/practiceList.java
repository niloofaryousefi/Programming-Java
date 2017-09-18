package Arrays;


import java.util.ArrayList;
import java.util.List;

public class practiceList {

	
	public static void main(String args[]){
		String digit = "23";
		String[] map = {"0" , "1" , "abc" , "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		String s = map[2];
		int n = s.length();
		System.out.println(n);
		for(int i = 0; i < n; i++){
			System.out.println(s.charAt(i));
		}
		 char Chr = digit.charAt(0);
		 int i = Character.getNumericValue(Chr);
		System.out.println(i);
		
		
	}

	

}
