package trees;

import java.util.Stack;

public class InorderTraversal {
	public static void main(String[] agrs) {
		Node x = new Node(15);
		x.left = new Node(10);
		x.right = new Node(20);
		x.left.left = new Node(8);
		x.left.right = new Node(12);
		x.right.left = new Node(16);
		x.right.right = new Node(25);
		inOrderIterative(x);
		
	}
	
	
	public static void inOrderRecursion(Node x) {
		if(x == null) {
			return;
		}
		
		inOrderRecursion(x.left);
		System.out.println(x.data);
		inOrderRecursion(x.right);
	}
	
	@SuppressWarnings("unused")
	public static void inOrderIterative(Node x) {
		Node curr = x;
		Stack<Node> stack = new Stack();
		
		while(!stack.isEmpty() || curr !=null) {
			if(curr!=null) {
				stack.push(curr);
				curr = curr.left;
			} else {
				curr = stack.pop();
				System.out.println(curr.data);
				curr = curr.right;
			}
			
			
		}
		
	}
	

}
