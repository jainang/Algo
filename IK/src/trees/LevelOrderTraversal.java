package trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public static void main(String[] agrs) {
		Node x = new Node(15);
		x.left = new Node(10);
		x.right = new Node(20);
		x.left.left = new Node(8);
		x.left.right = new Node(12);
		x.right.left = new Node(16);
		x.right.right = new Node(25);
		levelOrderTraversal(x);
		levelOrderTraversalIterative(x);
		
	}
	
	public static void levelOrderTraversal(Node x) {
		int level = 1;
		while(printLevel(x, level)) {
			level++;
		}
	}

	private static boolean printLevel(Node x, int level) {
		if(x == null) {
			return false;
		}
		
		if(level ==1) {
			System.out.println(x.data);
			return true;
		}
		
		boolean left = printLevel(x.left, level-1);
		boolean right = printLevel(x.right, level-1);
		return left || right;
		
	}
	
	public static void levelOrderTraversalIterative(Node x) {
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(x);
		
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			
			System.out.println(curr.data);
			
			if(curr.left!=null) {
				queue.add(curr.left);
			}
			
			if(curr.right!=null) {
				queue.add(curr.right);
			}
		}
	}
	
	

}
