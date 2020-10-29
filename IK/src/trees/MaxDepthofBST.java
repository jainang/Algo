package trees;

public class MaxDepthofBST {
	
	static int ans = 0;
	
	public static void main(String[] args) {
		Node x = new Node(1);
		x.left = new Node(3);
		x.right = new Node(2);
		x.right.left = new Node(5);
		x.right.right = new Node(4);
		System.out.println("Max depth" + maxDepthofBST(x));
        MaxDepthofBST maxdepth = new MaxDepthofBST();
		System.out.println( "Max depth LC " + maxdepth.maximum_depth(x, 1));
		
	}

	public static int maxDepthofBST(Node root) {
		if (root == null) {
			return 0;
		}

		int left = height(root.left);
		int right = height(root.right);

		return Math.max(left, right);
	}

	private static int height(Node root) {
		if (root == null) {
			return 0;
		}

		return 1 + Math.max(height(root.left), height(root.right));

	}
	
	private int answer;		// don't forget to initialize answer before call maximum_depth
	private void maximum_depth(Node root, int depth) {
	    if (root == null) {
	        return;
	    }
	    if (root.left == null && root.right == null) {
	        answer = Math.max(answer, depth);
	    }
	    maximum_depth(root.left, depth + 1);
	    maximum_depth(root.right, depth + 1);
	}

}
