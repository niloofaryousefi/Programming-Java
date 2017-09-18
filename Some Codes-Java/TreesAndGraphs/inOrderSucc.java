package TreesAndGraphs;

public class inOrderSucc {
	
	public static Node inOrderNextNode(Node n){
		if(n == null){
			return null;
		}
		
		if(n.right != null){
			return leftMostChild(n.right);
		}else{
			Node q = n;
			Node x = q.parent;
			while(x != null && x.left != q){
				q = x;
				x = x.parent;
			}
			return x;		
		}	
	}
	
	public static Node leftMostChild(Node n){
		if (n == null){
			return null;
		}
		Node current = n;
		while(current.left!= null){
			current = current.left;
		}
		return current;
	}

}
