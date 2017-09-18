package Arrays;

import java.util.Stack;


public class MySortStack {
	
		 public static Stack<Integer> Mysort(Stack<Integer> s){
			 Stack<Integer> newStack = new Stack<Integer>();
			 while(!s.isEmpty()){
				 int temp = s.pop();
				 while(!newStack.isEmpty() && newStack.peek() > temp){
					s.push(newStack.pop()); 
				 }
				 newStack.push(temp);
			 }
			 return newStack;
			 
		 }
		
		public static void main(String args[]){
		Stack<Integer> s = new Stack<Integer>();
		s.push(7);
		s.push(1);
		s.push(3);
		s.push(6);
		s.push(4);
		s.push(2);
		s.push(8);
		s.push(9);
		s.push(11);
		s.push(10);
		s.push(12);
		s.push(5);
	    Stack<Integer> r = Mysort(s);
		
		while(!r.isEmpty()){
		System.out.println(r.pop());
		}
		
		
	}


}
