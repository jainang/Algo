package trees;

import java.util.Stack;

public class PostOrderBST {
	
	public static void main(String[] agrs) {
		Node x = new Node(15);
		x.left = new Node(10);
		x.right = new Node(20);
		x.left.left = new Node(8);
		x.left.right = new Node(12);
		x.right.left = new Node(16);
		x.right.right = new Node(25);
		postOrderIterative(x);
		
	}
	
	public static void postOrderRecursion(Node x) {
		if(x == null) {
			return;
		}
		postOrderRecursion(x.left);
	
		postOrderRecursion(x.right);
		
		System.out.println(x.data);
	}
	
	@SuppressWarnings("unused")
	public static void postOrderIterative(Node x) {
		
		Stack<Node> stack = new Stack();
		stack.push(x);
		
		Stack<Integer> out = new Stack();
		
		while(!stack.isEmpty()) {
			Node curr = stack.pop();
			out.push(curr.data);
		
		if(curr.left!=null) {
			stack.push(curr.left);
		}
		
		if(curr.right != null) {
			stack.push(curr.right);
		}
		}
		
		while(!out.isEmpty()) {
			System.out.println(out.pop());
		}
			
		}

}
