package LinkedLists;


public class myLinkedList {
	Node head;
	
	public myLinkedList(){}
	
	//returns the head of the list
   public Node Head(){
	return head;
   }
	
	//check if the linked list is empty or not?!
	public boolean isEmpty(){
		if(head == null){
			return true;
		}else{
			return false;
		}
	}
	
	// gets the size of the linked list
	  public int size(){
	    	int size = 0;
	    	Node current = head;
	    	while(current != null){
	    		size++;
	    		current = current.next;
	    	}
	    	return size;
	    }
	  //add nodes to the end of the linked list
	  public void addtoTail(String data){
		  Node newNode = new Node(data);
		  if (isEmpty()){
			  head = newNode;
		  }else{
			  Node current = head;
			  while (current.getNext() != null){
				  current = current.getNext();
			  }
			  current.setNext(newNode);
		  }
		  
	  }
	 //add node to the beginning of the linked list 
	  public void addtoHead(String data){
		  Node newNode = new Node(data);
		  if(isEmpty()){
			  head = newNode;
		  }else{
			  newNode.setNext(head);
			  head = newNode;
		  }
	  }
	  //gets a node at index
	  public Node getNodeAt(int index){
		  Node current = head;
		  for(int i=0; i < index-1; i++){
			  current = current.next;
		  }
		  Node next = current.getNext();
		  return next;
		  }
	  // add element to a given position
	  public void addtoPosition(String data, int index){
		  int n = size();
		  if(index > n || index < 0){
			  System.out.println("This is an invalid position");
		  }else{
		  Node newNode = new Node(data);
		  Node previous = getNodeAt(index-1);
		  newNode.next = previous.next;
		  previous.next = newNode;
		  }
	  }
	  // add a node in linked list after a given node
	  public void addAfter(Node previous, String data){
		  if(previous == null){
			  System.out.println("The previous can not  be null");
		  }
		  Node newNode = new Node(data);
		  newNode.next = previous.next;
		  previous.next = newNode;
		  
	  }
	  // deletes node from the head of the linked list
	  public void deleteFirst(){
		  if (head == null){
			  System.out.println("The list is empty");
		  }else{
			Node temp = head;
			head = head.next;
			temp.next = null;
		  }
	  }
	  //deletes node from the tail of the linked list
	  public void deleteLast(){
		  Node current = head;
		  Node previous = null;
		  while(current.next != null){
			  previous = current;
			  current = current.next;
		  }
		  previous.next = null;
	  }
	  
	 //deletes node from a given position in linked list
	  public void deleteAt(int index){
		  int n = size();
		  if(index >= n || index < 0){
			  System.out.println("This is an invalid position");
		  }else{
		  Node current = head;
		  Node previous = null;
		  for (int i = 0; i < index; i++){
			 previous = current;
			 current = current.next;
		 }
		  previous.next = current.next;
		  current.next = null;
		  }
	  }
	 //prints out the element of the linked list
     public void display(){
	   if(head == null){
		   return;
	   }
	   Node current = head;
	   while(current != null){
		   System.out.print(current.data + "-->");
		   current = current.next;
		   
	   }
	   //to show the list has actually ended
	   System.out.println(current);
	   
   }
    
  
}
