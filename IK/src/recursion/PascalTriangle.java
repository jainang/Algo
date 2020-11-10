package recursion;

public class PascalTriangle {
	public static void main(String[] args) {
		System.out.println("Pascal Triangle:");
		print(4);

	}

	public static void print(int n) {

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - i; k++) {
				System.out.print(" "); // print space for triangle like structure
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(pascal(i, j) + " ");
			}
			System.out.println();
		}
	}

	public static int pascal(int i, int j) {
		if (j == 0 || j == i) {
			return 1;
		}
		return pascal(i - 1, j - 1) + pascal(i - 1, j);
	}

}
