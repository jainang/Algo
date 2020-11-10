package trees;

public class SearchBST {

	public static void main(String[] args) {
		Node x = new Node(15);
		x.left = new Node(10);
		x.right = new Node(20);
		x.left.left = new Node(8);
		x.left.right = new Node(12);
		x.right.left = new Node(16);
		x.right.right = new Node(25);

		System.out.println(search(x, 20));
	}

	public static Node search(Node root, int val) {
		// base case 
		if(root == null) {
			return root;
		}
		
		if(root.data == val) {
			return root;
		} 
		else {
			return val< root.data?search(root.left, val):search(root.right, val);
		}
	}
}
