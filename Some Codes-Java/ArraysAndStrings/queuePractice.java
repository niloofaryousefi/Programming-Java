package ArraysAndStrings;

public class queuePractice {
	public static void main(String[] args) {
		Queue  myqueue = new Queue();
		myqueue.enqueue(4);
		myqueue.enqueue("Niloofar");
		myqueue.enqueue('c');
		myqueue.enqueue(0.222);
		myqueue.enqueue("UCF");
		myqueue.enqueue('#');
		myqueue.queuedisplay();
		System.out.println();
		System.out.println(myqueue.dequeue());
		System.out.println();
		System.out.println(myqueue.dequeue());
		System.out.println();
		System.out.println(myqueue.dequeue());
		System.out.println();
		myqueue.queuedisplay();
	}

}
