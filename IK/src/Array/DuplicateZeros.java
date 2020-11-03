package Array;

public class DuplicateZeros {

	public static void main(String[] args) {
		int[] input = { 1, 0, 2, 3, 0, 4, 5, 0 };
		duplicateZeros(input);

	}

	public static void duplicateZeros(int[] input) {
		if (input == null) {
			return;
		}

		for (int i = 0; i < input.length; i++) {
			if (input[i] == 0) {
				int j;
				for (j = input.length - 2; j >= i + 1; j--) {
					input[j + 1] = input[j];

				}
				input[j] = 0;
				i++;
			}
		}
	}
	
	public static void duplicateZerosLC(int[] input) {
		int possibleDups = 0;
		int len = input.length -1;
		
		for(int left = 0; left <= len - possibleDups ; left++) {
			if(input[left] == 0) {
				if(left == len - possibleDups) {
					input[len] = 0;
					len = 1;
					break;
				}
				  possibleDups++;
			}
		}
		
		 // Start backwards from the last element which would be part of new array.
        int last = len - possibleDups;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (input[i] == 0) {
            	input[i + possibleDups] = 0;
                possibleDups--;
                input[i + possibleDups] = 0;
            } else {
            	input[i + possibleDups] = input[i];
            }
        }
	}
}