package ArraysAndStrings;

class Node{
	Object data;
	Node next;
	public Node(Object d){
		data = d;
		next = null;
	}
	
	void display(){
		System.out.println(data + "-->");
	}
}


public class Stack {
	 Node top;
	
	public Stack(){}
	Object Top(){
		return top.data;
		
	}
	
	
	Object pop(){
	if (top == null){
		return null;
	}else{
		Object item = top.data;
		top = top.next;
		return item;
	}
	}
	
	void push (Object item){
		Node newNode = new Node(item);
		newNode.next = top;
		top = newNode;
	}
	Object peek(){
		return top.data;
	}
	
	void stackdisplay(){
		if(top != null){
			Node current = top;
			while(current != null){
		    System.out.print(current.data + "-->");
			current = current.next;
			}
		}else{
			System.out.println("Stack is empty");
		}
	}
	
	

}
