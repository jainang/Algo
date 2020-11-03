package trees;

public class SortedArraytoBST {
   public static void main(String[] args) {
	   int[] arr = {1, 2, 3, 4, 5, 6, 7};
	   int n = arr.length;
	   Node root = sortedArray(arr, 0, n-1);
	   System.out.println("Preorder traversal of constructed BST"); 
	   preOrder(root); 
	   
   }
   
   static void preOrder(Node node) { 
       if (node == null) { 
           return; 
       } 
       System.out.print(node.data + " "); 
       preOrder(node.left); 
       preOrder(node.right); 
   } 
   
   public static Node sortedArray(int[] arr, int start, int end) {
	   if(start>end) {
		   return null;
	   }
	   
	   int mid = (start +end)/2;
	   
	   Node node = new Node(arr[mid]);
	   node.left = sortedArray(arr, start, mid-1);
	   node.right = sortedArray(arr, mid+1, end);
	   
	   return node;
   }
}
