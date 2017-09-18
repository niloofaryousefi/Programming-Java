package TreesAndGraphs;
import TreesAndGraphs.binaryTree;


public class BtreePractice {

	public static void main(String args[]){
		binaryTree tree = new binaryTree();
		tree.addNode(50);
		tree.addNode(3);
		tree.addNode(8);
		tree.addNode(2);
		tree.addNode(1);
		tree.addNode(7);
		tree.addNode(6);
		tree.addNode(21);
		tree.addNode(17);
		tree.addNode(32);
		tree.inOrderTraverseTree(tree.root);
		tree.deleteNode(17);
		System.out.println();
		tree.inOrderTraverseTree(tree.root);
		System.out.println();
		int min_value = tree.treeMinValue(tree.root);
		System.out.println(min_value);
		System.out.println();
		System.out.println(tree.root.data);
		System.out.println(tree.treeMaxValue(tree.root));
		System.out.println();
		System.out.println(tree.isBST(tree.root));
		
		
	}

}
