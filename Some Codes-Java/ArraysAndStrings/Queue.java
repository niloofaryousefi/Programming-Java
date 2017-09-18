package ArraysAndStrings;

public class Queue {

	Node first, last;
	
	void enqueue(Object item){
		if (first ==null){
			last = new Node(item);
			first = last;
		}else{
			last.next = new Node(item);
			last = last.next;
		}
	}
	
	Object dequeue(){
		if(first == null){
			return null;
		}else{
			Object item = first.data;
			first = first.next;
			if(first == null){
				System.out.println("the queue is empty");
			}
			return item;
		}
	}
	
	void queuedisplay(){
		if(first == null){
			System.out.println("the queue is empty");
		}else{
			Node current = first;
			while(current != null){
				System.out.print(current.data + "-->");
				current = current.next;
			}
		}
	}

}
