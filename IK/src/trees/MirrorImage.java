package trees;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorImage {

	public static void main(String[] agrs) {
		Node x = new Node(1);
		x.left = new Node(2);
		x.right = new Node(2);
		x.right.left = new Node(4);
		x.right.right = new Node(3);
		x.left.left = new Node(3);
		x.left.right = new Node(5);
		System.out.println("Is mirror image " + isMirrorImage(x));

		System.out.println("Is mirror image Iterative " + isSymmetric(x));

	}

	public static boolean isMirrorImage(Node node) {
		return isMirror(node, node);
	}

	private static boolean isMirror(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return true;
		}
		if (node1 == null || node2 == null) {
			return false;
		}

		return (node1.data == node2.data) && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);

	}

	// iterative solution

	public static boolean isSymmetric(Node node) {
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		q.add(node);
		while (!q.isEmpty()) {
			Node n1 = q.poll();
			Node n2 = q.poll();
			if (n1 == null && n2 == null) {
				continue;
			}

			if (n1 == null || n2 == null) {
				return false;
			}

			if (n1.data != n2.data) {
				return false;
			}
			q.add(n1.left);
			q.add(n2.right);
			q.add(n1.right);
			q.add(n2.left);
		}
		return true;

	}

}
