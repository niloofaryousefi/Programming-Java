package ArraysAndStrings;

public class stackPractice {

	public static void main(String[] args) {
		 Stack mystack = new Stack();
		 Object item1 = "Niloo";
		 Object item2 = 4;
		 mystack.push(item1);
		 mystack.push(item2);
		 System.out.println(mystack.peek());
		 mystack.stackdisplay();
		 System.out.println();
		 System.out.print("this is removed from stack: ");
		 System.out.println(mystack.pop());
		 System.out.println();
		 mystack.stackdisplay();
		 
	}

}
