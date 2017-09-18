package LinkedLists;

public class deleteDups2 {
	
	public static void deleteDuplicatesII(myLinkedList list){
		Node head = list.Head();
		if (head == null) return;
		Node current  = head;
		while(current != null){
			Node pointer_privious = current;
			while (pointer_privious.next != null){
				if(current.data == pointer_privious.next.data){
					pointer_privious.next = pointer_privious.next.next;	
				}else{
				pointer_privious = pointer_privious.next;
				}
			}
			current = current.next;
		}
	  	list.display();
	}

	public static void main(String[] args){
		 myLinkedList list = new myLinkedList();
			
			list.addtoTail("Niloofar");
			list.addtoTail("Yousefi");
			list.addtoTail("Niloofar");
			list.addtoTail("at UCF");
			list.addtoHead("I'm the best");
			list.addtoPosition("at UCF", 4);
			Node previous = list.getNodeAt(3);
			list.addAfter(previous, "Niloofar");
			list.display();
			Node head = list.Head();
			head.display();
			deleteDuplicatesII(list);
	 }
}
