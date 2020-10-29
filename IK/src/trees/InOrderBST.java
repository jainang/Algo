package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderBST {
	Node root;

	public static void main(String[] agrs) {
		InOrderBST inOrderBST = new InOrderBST();
		Node root;
		root = new Node(2);
		root.left = new Node(1);
		root.right = new Node(3);

		System.out.println("Printing PostOrder Iterative using recursion");

		List<Integer> inOrderRes = inOrderBST.inOrderTraversal(root);

		inOrderRes.forEach(System.out::println);
		

		System.out.println("Printing PostOrder Iterative using stacks");

		List<Integer> inOrderStack = inOrderBST.inOrderUsingStacks(root);

		inOrderStack.forEach(System.out::println);
	}

	public List<Integer> inOrderTraversal(Node root) {
		List<Integer> ans = new ArrayList();
		helper(root, ans);
		return ans;
	}

	private void helper(Node root, List<Integer> ans) {
		if (root != null) {
			if (root.left != null) {
				helper(root.left, ans);
			}
			ans.add(root.data);
			if (root.right != null) {
				helper(root.right, ans);
			}
		}

	}

	public List<Integer> inOrderUsingStacks(Node root) {
		List<Integer> ans = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<>();
		Node curr = root;
		while (curr != null && !stack.isEmpty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			ans.add(curr.data);
			curr = curr.right;
		}
		return ans;
	}

}
