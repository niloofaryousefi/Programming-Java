package Arrays;

class Node{
	int data;
	Node next;
	
	public Node(int d){
	    data = d;
		next = null;
	}
	
	public void nodeDisplay(){
		if(next != null){
		System.out.println(data + "-->" + next.data);
		}else{
			System.out.println(data + "-->" + null);	
		}
	}
}
class linkedlist{
	Node head;
	public linkedlist(){}
	
	public Node Head(){
		return head;
	}
	
	public boolean isEmpty(){
		if(head == null){
			return true;
		}else{
			return false;
		}
	}
	
	public void addtoHead(int d){
		Node newNode = new Node(d);
		if(head == null){
			head = newNode;
		}else{
		newNode.next = head;
		head = newNode;
		}
	}
	
	public void addtoTail(int d){
		Node newNode = new Node(d);
		if(head == null){
			head = newNode;
		}
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
		newNode.next = null;
	}
	
	public int size(){
		if(head ==  null){
			return 0;
		}
		int length = 0;
		Node current = head;
		while(current != null){
			current =  current.next;
			length++;
		}
		return length;
	}
	
	public void display(){
		if(head == null){
			System.out.println("the list is empty");
		}
		Node current  = head;
		while(current != null){
			System.out.print(current.data + "-->");
			current =  current.next;
		}
		System.out.print(current);
	}
}

public class addLists{
	
		public static Node addTwoLists(Node first, Node second){
		int carry = 0; 
        int sum;
		Node temp = null;
		Node head = null;
		Node current = head;
		while(first != null || second != null){
			sum = carry + (first != null ? first.data:0) + (second != null ? second.data : 0);
			carry = (sum >= 10) ? 1:0;
			sum =  sum % 10;
			temp= new Node (sum);
						
			if(head == null){  
		     head = temp;
		   	}else{
			current.next = temp;
			}
			current = temp;
			if(first != null){
			first = first.next;
			}
			if(second != null){
			second = second.next;
			}
		}
		 if(carry > 0){
			 temp.next = new Node(carry);
		 }
		 return head;
	}	
	
	
	
	
   public static void main(String args[]){
	   linkedlist list = new linkedlist();
	   linkedlist list2 = new linkedlist();
	   list.addtoHead(6);
	   list.addtoHead(3);
	   list.addtoHead(7);
	   list.addtoHead(8);
	   list.display();
	   System.out.println();
	   list2.addtoTail(4);
	   list2.addtoTail(8);
	   list2.addtoTail(7);
	   list2.addtoTail(5);
	   list2.display();
	   Node first = list.Head();
	   Node second = list2.Head();
	   System.out.println();
	   Node result = addTwoLists(first, second);
	   mydisplay(result);
	   System.out.println();
	   
	   
	   Node temp1 = null;
	   Node head1 = null;
	   Node curr1 = null;
	   
	   temp1 = new Node(2);
	   temp1.next = new Node(5);
	   head1 =temp1;
	   curr1 = head1;
	   temp1.nodeDisplay();
	   head1.nodeDisplay();
	   curr1.nodeDisplay();
	   
	   temp1 = new Node(4);
	   temp1.nodeDisplay();
	   head1.nodeDisplay();
	   curr1.nodeDisplay();
	   
   }
   
   
   public static void mydisplay(Node n){
		if(n == null){
			System.out.println("the list is empty");
		}
		Node current  = n;
		while(current != null){
			System.out.print(current.data + "-->");
			current =  current.next;
		}
		System.out.print(current);
	}
}
