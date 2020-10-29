package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTPostOrderIterative {

	public static void main(String[] agrs) {
		Node root;
		BSTPostOrderIterative postOrder = new BSTPostOrderIterative();
		root = new Node(2);
		root.left = new Node(1);
		root.right = new Node(3);

		System.out.println("Printing PostOrder Iterative using Stacks");

		List<Integer> postOrderedElements = postOrder.postOrderTraversal(root);

		postOrderedElements.forEach(System.out::println);
	}

	public List<Integer> postOrderTraversal(Node root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;
		}

		Stack<Node> stack = new Stack<Node>();
		stack.push(root);

		while (root != null && !stack.isEmpty()) {
			Node node = stack.peek();
			if (node.left == null && node.right == null) {
				stack.pop();
				list.add(node.data);
			} else {
				if (node.right != null) {
					stack.push(node.right);
					node.right = null;
				}

				if (node.left != null) {
					stack.push(node.left);
				}

			}
		}

		return list;

	}

}
