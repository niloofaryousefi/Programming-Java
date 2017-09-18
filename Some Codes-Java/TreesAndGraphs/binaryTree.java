package TreesAndGraphs;

public class binaryTree {
	public Node root;
	
	public binaryTree(){
		this.root = null;
	}
	
	
	
	public boolean isEmpty(){
		if (root == null) {
			return true;
		}else{
			return false;
		}
	}
	
	public void addNode(int value){
		Node newNode = new Node(value);
		
		if(root == null){
			root = newNode;
		}else{
			Node current = root;
			Node parent;
			while(true){
				parent  = current;
				if(value < current.data){
					current  = current.left;
					
					if(current == null){
						parent.left = newNode;
						return;
					}
				}else{
					current = current.right;
					
					if(current == null){
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraverseTree(Node node){
		if(node != null){
			inOrderTraverseTree(node.left);
			System.out.println(node);
			inOrderTraverseTree(node.right);
		}
	}
	
	public void preOrderTraverseTree(Node node){
		if(node != null){
			System.out.println(node);
			preOrderTraverseTree(node.left);
			preOrderTraverseTree(node.right);
		}
	}
	
	public void postOrderTraverseTree(Node node){
		if(node != null){
			postOrderTraverseTree(node.left);
			postOrderTraverseTree(node.right);
			System.out.println(node);
		}
	}
	
	public Node findNode(int key){
		Node current = root;
		while(current.data != key){
			if(key < current.data){
			current = current.left;
		   }else{
			current = current.right;	
		   }
			if(current == null)
				return null;
		}
		return current;
	}
	
	public boolean deleteNode(int key){
		Node parent = root;
		Node current = root;
		boolean isItALeftChild = false;
		
		while(key != current.data){
			parent  = current;
			if(key < current.data){
				current = current.left;
				if(key == current.data)
					isItALeftChild = true;
		   }else{
			current = current.right;
			if(key == current.data)
				isItALeftChild = false;
		   }
			if(current == null)
				return false;
			
		}
		if(current.left == null && current.right == null){
			 if(isItALeftChild)
				 parent.left = null;
			 else
				 parent.right = null;
		}else if(current.left == null){
			if (isItALeftChild) 
				parent.left = current.right;
			else
				parent.right = current.right;
			
		}else if (current.right == null){
			if(isItALeftChild)
				parent.left = current.left;
			else
				parent.right = current.left;
		}else{
			Node replacement = replacementNode(current);
			
			if(current == root)
				root = replacement;
			
			else if(isItALeftChild)
				parent.left = replacement;
			else
				parent.right = replacement;
			
			replacement.left = current.left;
		}
	return true;	
	}
	
	public Node replacementNode(Node replacedNode){
		Node replacement = replacedNode.right;
		Node replacementParent = replacedNode.right;
		while(replacement.left != null){
			replacementParent = replacement;
			replacement = replacement.left;
		}
		if(replacement != replacedNode.right){
		replacementParent.left = replacement.right;
		replacement.right = replacedNode.right;
		}
		return replacement;
	}
	
	public int treeMinValue(Node root){
		if (root == null){
			return Integer.MAX_VALUE;
		}
		
		return Math.min(Math.min(treeMinValue(root.right), treeMinValue(root.left)), root.data);
	}
	
	public int treeMaxValue(Node root){
		if (root == null){
			return Integer.MIN_VALUE;
		}
		
		return Math.max(Math.min(treeMaxValue(root.right), treeMaxValue(root.left)), root.data);
	}
	
	public boolean isBST(Node root){
		if(root == null){
			return true;
		}
		
		if(root.left != null && treeMaxValue(root.left) > root.data){
			return false;
		}
		
		if(root.right != null && treeMinValue(root.right) < root.data){
			return false;
		}
		
		if(!isBST(root.left) || !isBST(root.right)){
			return false;
		}
		return true;
	}
	
	
}



 