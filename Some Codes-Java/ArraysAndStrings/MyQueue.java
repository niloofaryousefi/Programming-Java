package Arrays;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> oldestStack;
	Stack<Integer> newestStack;
	
	public MyQueue(){
		oldestStack = new Stack<Integer>();
		newestStack = new Stack<Integer>();
	}
	
	public int size(){
		return oldestStack.size() + newestStack.size();
	}
	
	public void add(int value){
		newestStack.push(value);
	}
	
	public int pop(){
		int answer;
		if(!oldestStack.isEmpty()){
			answer = oldestStack.pop();
		}else{
			while(!newestStack.isEmpty()){
				int top = newestStack.pop();
				oldestStack.push(top);
			}
			answer = oldestStack.pop();
		}
		return answer;
	}
	
	public int peek(){
		int answer;
		if(!oldestStack.isEmpty()){
			answer = oldestStack.peek();
		}else{
			while(!newestStack.isEmpty()){
				int top = newestStack.pop();
				oldestStack.push(top);
			}
			answer = oldestStack.peek();
		}
		return answer;
	}

}
