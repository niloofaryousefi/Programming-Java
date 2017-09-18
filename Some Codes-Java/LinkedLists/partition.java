package LinkedLists;

public class partition {
	
	public static Node partitionList(myLinkedList list, String value){
	Node head = list.Head();
	Node tail = list.Head();
	Node node = head;
	
	while(node != null){
		if(node.data != value){
			node.next = head;
			head = node;
		}else{
			tail.next = node;
			tail = node;
		}
		node = node.next;
	}
	 tail.next = null;
	 return head;
	}
  		

}
