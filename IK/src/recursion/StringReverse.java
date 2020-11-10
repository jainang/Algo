package recursion;

public class StringReverse {
	
	public static void main(String[] args) {
		String s = "Ankita";
		char[] str2 = {'h','e','l','l','o'};
		char[] str = s.toCharArray();
		reverseString(str2);
	}
	
	public static void printReverse(char[] str) {
		helper(0, str);
	}

	private static void helper(int i, char[] str) {
		// base case 
		if(str== null || i >= str.length) {
			return;
		}
		
		helper(i+1, str);
		System.out.println(str[i]);
	}
	
	
	public static void reverseString(char[] s) {
		reverseHelper(s, 0, s.length-1);
	}

	private static void reverseHelper(char[] s, int left, int right) {
		if(left >= right) {
			return;
		}
		
		char temp = s[left];
		s[left] = s[right];
		s[right] = temp;
		
		reverseHelper(s, left + 1, right - 1);
	}
	
	

}
