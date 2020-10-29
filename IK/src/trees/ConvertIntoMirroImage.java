package trees;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertIntoMirroImage {

	public static void main(String[] args) {
		Node x = new Node(1);
		x.left = new Node(3);
		x.right = new Node(2);
		x.right.left = new Node(5);
		x.right.right = new Node(4);

		inOrder(x);
		mirror(x);
		inOrder(x);
	}

	public static Node mirrorImage(Node node) {
		if (node == null) {
			return node;
		}

		Node left = mirrorImage(node.left);
		Node right = mirrorImage(node.right);

		node.left = right;
		node.right = left;
		return node;
	}

	/*
	 * Helper function to test mirror(). Given a binary search tree, print out its
	 * data elements in increasing sorted order.
	 */
	static void inOrder(Node node) {
		if (node == null)
			return;

		inOrder(node.left);
		System.out.print(node.data + " ");

		inOrder(node.right);
	}
	
	// level ordering and reversing during that.

	static void mirror(Node node) {
		if (node == null) {
			return;
		}

		Queue<Node> q = new LinkedList<>();
		q.add(node);

		while (q.size() > 0) {
			Node curr = q.peek();
			q.remove();

			// Swap nodes
			Node temp = curr.left;
			curr.left = curr.right;
			curr.right = temp;

			if (curr.left != null) {
				q.add(curr.left);
			}
			if (curr.right != null) {
				q.add(curr.right);
			}

		}

	}

}
