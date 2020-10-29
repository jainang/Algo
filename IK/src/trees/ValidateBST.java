package trees;

import java.util.Deque;
import java.util.LinkedList;

public class ValidateBST {
	
	Node root;

	public static void main(String[] agrs) {
		ValidateBST validateBST = new ValidateBST();
		Node root;
		root = new Node(2);
		root.left = new Node(1);
		root.right = new Node(3);
		System.out.println(validateBST.validateBST(root));
	}
	
	// Iterative approach usings Stacks
	
	LinkedList<Node> stack = new LinkedList();
	LinkedList<Integer> uppers = new LinkedList();
	LinkedList<Integer> lower = new LinkedList();
	
	
	public boolean isBSTIterativeUsingStacks(Node root) {
	  if(root == null) {
		  return true;
		}
	  
	  Deque<Node> stack = new LinkedList<>();
	  Node node = root;
	  int prev = Integer.MIN_VALUE;
	  int current;
	  
	  while(true) {
		  if(node!=null) {
			  stack.addFirst(node);
			  node = node.left;
		  } else {
			  if()
		  }
	  }
	  
	  
		
	}
		

}
