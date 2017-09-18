package Arrays;

public class findLoopStart {
	
	public static Node findLoop(Node head){
		Node slow = head;
		Node fast = head;		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				 break;
		     }
		}
		
		if(fast == null || fast.next == null){
			return null;
		}
		
		slow = head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		
		return fast;
		
	}
	
  public static void main(String args[]){
	  Node first = new Node(1);
	  Node second = new Node (2);
	  Node third = new Node(3);
	  Node fourth = new Node(4);
	  Node fifth =  new Node(5);
	  // the loop starts at node six
	  Node sixth =  new Node(6);
	  Node seventh = new Node(7);
	  Node eighth = new Node(8);
	  Node nineth =  new Node(9);
	  
	  first.next = second;
	  second.next = third;
	  third.next = fourth;
	  fourth.next = fifth;
	  
	  fifth.next = sixth;
	  sixth.next = seventh;
	  seventh.next = eighth;
	  eighth.next = nineth;
	  nineth.next = sixth;
	  first.nodeDisplay();
	  second.nodeDisplay();
	  fifth.nodeDisplay();
	  nineth.nodeDisplay();
	  
	  Node loop = findLoop(first);
	  loop.nodeDisplay();
	  
  }
}
