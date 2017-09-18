package TreesAndGraphs;

public class checkBST {
	public static Integer last_printed = null;
	public static boolean checkBST(Node root){
		if(root == null){
			return true;
		}
		if(!checkBST(root.left)) return false;
			
		
		if(last_printed != null && root.data <= last_printed){
			return false;
		}
		last_printed = root.data;
		
		if(!checkBST(root.right)) return false;
		
		return true;
	}

}
