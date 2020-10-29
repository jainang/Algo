package trees;

public class RoottoLeafPathSum {
	public static void main(String[] args) {
		Node x = new Node(1);
		x.left = new Node(3);
		x.right = new Node(2);
		x.right.left = new Node(5);
		x.right.right = new Node(4);
        
        if(roottoLeafPathSum(x, 7)) {
        	System.out.println("There is a root to leaf path with sum "); 
        } else {
        	 System.out.println("There is no root to leaf path with sum "); 
        }
        
	}
	
	public static boolean roottoLeafPathSum(Node node, int sum) {
		if(node == null) {
			return sum == 0;
		}
		return roottoLeafPathSum(node.left, sum - node.data) || roottoLeafPathSum(node.right, sum - node.data);
		
	}
	
}
