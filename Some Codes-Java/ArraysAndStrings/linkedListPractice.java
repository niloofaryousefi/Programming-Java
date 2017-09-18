package Arrays;

public class linkedListPractice {
	
	public static void main(String[] args){
		myLinkedList list = new myLinkedList();
		
		list.addtoTail("Niloofar");
		list.addtoTail("Yousefi");
		list.addtoTail("PhD student");
		list.addtoTail("at UCF");
		list.addtoHead("I'm the best");
		list.addtoPosition("khoshgel", 4);
		Node previous = list.getNodeAt(3);
		list.addAfter(previous, "and the next");
		//list.addtoPosition("khoshgel", 4);
		list.display();
		list.deleteAt(4);
		list.display();
		list.addtoPosition("Possible", 6);
		list.display();
		list.addtoPosition("Impossible", 6);
		list.display();
		//list.deleteLast();
		//list.display();
		//System.out.println(list.size());
		//System.out.println(previous.getData());
		}
     
}
