package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class creatLevelLinkledList {

	ArrayList<LinkedList<Node>> levelLinkedList(Node root){
		ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
		
		LinkedList<Node> current = new LinkedList<Node>();
		if(root != null){
			current.add(root);
		}
		
		while(current.size() > 0){
			result.add(current);
			LinkedList<Node> parents = current;
			current = new LinkedList<Node>();
			for (Node parent: parents){
				if(parent.left !=  null){
					current.add(parent.left);
				}
				if(parent.right != null){
				current.add(parent.right);
				}
			}
		}
		return result;
	}
}
