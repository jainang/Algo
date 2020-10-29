package trees;

public class ConstructTree {
	
	Node root; 
    static int preIndex = 0; 
	
	public static void main(String[] agrs) {
		ConstructTree t = new ConstructTree();
		int[] inOrder = {2,3,1,4,5};
		int[] preOrder = {1, 2,3, 4,5};
		int len = inOrder.length;
		
		Node root = t.buildTree(inOrder, preOrder, 0, len-1);
		System.out.println("Tree Constructed");
		t.printInOrder(root);
		
		
	}

	private void printInOrder(Node root) { // to print tree nodes
		if(root == null) {
			return;
		}
		
		printInOrder(root.left);
		
		System.out.println( root.data + " ");
		
		printInOrder(root.right);
		
	}

	private Node buildTree(int[] inOrder, int[] preOrder, int inStart, int inEnd) {
		if(inStart > inEnd) {
			return null;
		}
		
		Node tNode = new Node(preOrder[preIndex++]);
		
	}

}
