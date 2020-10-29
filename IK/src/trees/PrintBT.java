package trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintBT {
	
	public static void main(String[] agrs) {
		Node root;
		root = new Node(2);
		root.left = new Node(1);
		root.right = new Node(3);
		printTree(root);
	}
	
	public static List<List<String>> printTree(Node root){
		int height = getHeight(root);
		int width = (int) Math.pow(2, height) - 1;
		String[][] arr = new String[height][width];
		
		for(String[] a : arr) {
			Arrays.fill(a, "");
		}
		
		helper(arr, 0, 0, width -1, root);
		
		List<List<String>> res = new ArrayList<>();
		for(String[] a : arr) {
			res.add(Arrays.asList(a));
		}
		
		return res;
	}

	private static void helper(String[][] arr, int level, int left, int right, Node root) {
		if(root == null) {
			return;
		}
		int mid = (left+right)/2;
		arr[level][mid] = String.valueOf(root.data); // setting root node in middle of first row;
		helper(arr, level+1, left, mid-1, root.left);
		helper(arr, level+1, mid+1, right, root.right);
		
	}

	private static int getHeight(Node root) {
		if(root == null) {
			return 0;
		}
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}

}
