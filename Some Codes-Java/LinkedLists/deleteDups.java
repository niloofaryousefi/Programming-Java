package LinkedLists;

import java.util.HashSet;

public class deleteDups {
	public static void deleteDuplicates(Node n){
		HashSet<String> set = new HashSet<String>();
			while (n != null){
			if(!set.contains(n.data)){
			set.add(n.data);
			}	
			n = n.next;
		}
			System.out.println(set);
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
		deleteDuplicates(head);	
 }
	
}
