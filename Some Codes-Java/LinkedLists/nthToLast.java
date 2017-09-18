package LinkedLists;

public class nthToLast {
	
	public static Node kthToLast(myLinkedList list, int k){
		Node head = list.Head();
		if(head == null) return null;
		Node p1 = head;
		Node p2 = head;
		for (int i = 0; i < k-1; i++){
			if(p2 == null) return null;
			p2 =  p2.next;
		}
		
		if(p2 == null) return null;
		while(p2.next != null){
			p2 = p2.next;
			p1 = p1.next;
		}
		return p1;
		
	}

	
	public static void main(String[] args){
		 myLinkedList list = new myLinkedList();
			
			list.addtoTail("Niloofar");
			list.addtoTail("Yousefi");
			list.addtoTail("Ali");
			list.addtoTail("at UCF");
			list.addtoHead("I'm the best");
			list.addtoPosition("Derakhshani", 4);
			Node previous = list.getNodeAt(3);
			list.addAfter(previous, "Orlando");
			list.display();
			Node head = list.Head();
			head.display();
			Node ofInterest = kthToLast(list, 3);
			ofInterest.display();
	 }
}
