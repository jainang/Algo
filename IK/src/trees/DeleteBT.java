package trees;

public class DeleteBT {

	public static void main(String[] agrs) {
		Node x = new Node(15);
		x.left = new Node(10);
		x.right = new Node(20);
		x.left.left = new Node(8);
		x.left.right = new Node(12);
		x.right.left = new Node(16);
		x.right.right = new Node(25);

		delete(x);
	    x = null; 
	    System.out.println("Tree deleted"); 

	}

	private static void delete(Node x) {
     x= null;
      
	}

}
