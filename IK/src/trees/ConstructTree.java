package trees;

public class ConstructTree {

	Node root;
	static int preIndex = 0;

	public static void main(String[] agrs) {
		ConstructTree t = new ConstructTree();
		int[] inOrder = { 2, 3, 1, 4, 5 };
		int[] postOrder = { 1, 2, 3, 4, 5 };
		int len = inOrder.length;

		Node root = t.buildTree(inOrder, postOrder);
		System.out.println("Tree Constructed");
		t.printInOrder(root);

	}

	class Index {

		int index = 0;
	}

	private void printInOrder(Node root) { // to print tree nodes
		if (root == null) {
			return;
		}

		printInOrder(root.left);

		System.out.println(root.data + " ");

		printInOrder(root.right);

	}

	int postIndex;

	public Node buildTree(int[] inorder, int[] postorder) {
		Index postIndex = new Index();
		postIndex.index = postorder.length - 1;
		return constructTree(inorder, postorder, 0, postorder.length - 1, postIndex);
	}

	private Node constructTree(int[] inOrder, int[] preOrder, int inStart, int inEnd, Index postIndex2) {
         
	}

}
