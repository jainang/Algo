package trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class HeightTree {
	public static void main(String[] agrs) {
		Node x = new Node(15);
		x.left = new Node(10);
		x.right = new Node(20);
		x.left.left = new Node (8);
		x.left.right = new Node(12);
		x.right.left = new Node(16);
		x.right.right = new Node(25);
		
		System.out.println(height(x));
		System.out.println(heightIterative(x));
	}

	// recursive approach
	private static int height(Node x) {
		if(x==null) {
			return 0;
		}
		return 1 + Math.max(height(x.left), height(x.right));
	}
	
	// iterative approach
	private static int heightIterative(Node x) {
		if(x == null) {
			return 0;
		}
		
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(x);
		
		Node front = null;
		int height = 0;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			while(size-- > 0) {
				front = queue.poll();
				if(front.left!= null) {
					queue.add(front.left);
				}
				if(front.right!=null) {
					queue.add(front.right);
				}
			}
			height++;
		}
		return height;
	}

}
