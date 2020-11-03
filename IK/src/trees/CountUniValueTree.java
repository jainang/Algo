package trees;

class Count {
	int count = 0;
}

public class CountUniValueTree {
	private Node root;

	public static void main(String[] args) {
		Count ct = new Count();
		CountUniValueTree tree = new CountUniValueTree();
		tree.root = new Node(5);
		tree.root.left = new Node(4);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(4);
		tree.root.right.right = new Node(5);

		System.out.println("The count of single valued sub trees is : " + tree.countSingle(root));
	}

	private String countSingle(Node node) {
		countSingleRec(node, ct); 
	        return ct.count;
	}
	
	 boolean countSingleRec(Node node, Count c)  
	    {
	    
	    }

}
