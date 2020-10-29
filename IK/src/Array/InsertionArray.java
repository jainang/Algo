package Array;

public class InsertionArray {

	public static void main(String[] args) {
		int[] intArray = new int[6];
		int length = 0;

		for (int i = 0; i < 3; i++) {
			intArray[length] = i;
			length++;
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Index " + i + " contains " + intArray[i]);
		}

		intArray[length] = 10;
		length++;

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Index " + i + " contains " + intArray[i]);
		}

		// insert in the begining

		for (int i = 3; i >= 0; i--) {
			intArray[i + 1] = intArray[i];
		}
		
		intArray[0] = 20;

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Index " + i + " contains " + intArray[i]);
		}
		
		// insert anywere 
		

	}

}
