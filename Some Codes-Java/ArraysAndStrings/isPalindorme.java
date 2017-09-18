package Arrays;

import java.util.Stack;

public class isPalindorme {
	
	public static boolean palindorme(Node head){
		Stack<Integer> stack = new Stack<Integer>(); 
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		// to handle odd-sized linked lists
		if(fast!= null){
			slow = slow.next;
		}
			while(slow != null){
				int top = stack.pop();
				if(top != slow.data){
					return false;
			}
				slow = slow.next;
		}
			return true;
	}

	public static void main(String args[]){
		 linkedlist list = new linkedlist();
		   list.addtoHead(6);
		   list.addtoHead(3);
		   list.addtoHead(7);
		   list.addtoHead(8);
		   list.addtoHead(2);
		   list.addtoHead(3);
		   list.addtoHead(6);
		   list.display();
		   System.out.println();
		   Node head = list.Head();
		   System.out.println(palindorme(head));
	}
	
}
