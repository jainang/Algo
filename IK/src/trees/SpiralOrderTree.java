package trees;

public class SpiralOrderTree {
	
	public static void main(String[] agrs) {
		Node x = new Node(15);
		x.left = new Node(10);
		x.right = new Node(20);
		x.left.left = new Node(8);
		x.left.right = new Node(12);
		x.right.left = new Node(16);
		x.right.right = new Node(25);
		
		spiralOrderTraversal(x);
	}
	
	public static void spiralOrderTraversal(Node x) {
		if(x == null) {
			return;
		}
		int level = 1;
		while(printLevelLeftToRight(x, level++) && printLevelRightToleft(x, level++));
	}

	private static boolean printLevelLeftToRight(Node x, int level) {
		if(x == null) {
			return false;
		}
		
		if(level ==1) {
			System.out.println(x.data);
			return true;
		}
		
		boolean left = printLevelLeftToRight(x.left, level-1);
		boolean right = printLevelLeftToRight(x.right, level-1);
		return left || right;
		
	}
	
	private static boolean printLevelRightToleft(Node x, int level) {
		if(x == null) {
			return false;
		}
		
		if(level ==1) {
			System.out.println(x.data);
			return true;
		}
		
		boolean left = printLevelRightToleft(x.right, level-1);
		boolean right = printLevelRightToleft(x.left, level-1);
		return right || left;
		
	}

}
