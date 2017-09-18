package LinkedLists;

public class Node{
    String data;
    Node next;

   public Node(String data){
	  this.data = data;
	  this.next = null;
	}
 
   public String getData(){
	   return data;
   }
  
   public void setNext(Node node){
	   next = node;
   }
   
   public Node getNext(){
	   return next;
   }
    public void display(){
    	System.out.println(data + "-->" + next.data);
    }
}
