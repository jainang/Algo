package trees;

import java.util.Stack;

public class PreOrderTraversal {
	public static void main(String[] agrs) {
		Node x = new Node(15);
		x.left = new Node(10);
		x.right = new Node(20);
		x.left.left = new Node(8);
		x.left.right = new Node(12);
		x.right.left = new Node(16);
		x.right.right = new Node(25);
		preOrderIterative(x);
		
	}
	
	
	public static void preOrderRecursion(Node x) {
		if(x == null) {
			return;
		}
		System.out.println(x.data);
		preOrderRecursion(x.left);
	
		preOrderRecursion(x.right);
	}
	
	@SuppressWarnings("unused")
	public static void preOrderIterative(Node x) {
		
		Stack<Node> stack = new Stack();
		stack.push(x);
		
		while(!stack.isEmpty()) {
			Node curr = stack.pop();
			System.out.println( curr.data);
		if(curr.right != null) {
			stack.push(curr.right);
		}
		
		if(curr.left!=null) {
			stack.push(curr.left);
		}
			
		}
	}
}
