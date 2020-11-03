package Strings;

import java.util.Arrays;

public class UinqueCharsInString {
	public static void main(String[] args) {
		String str = "hutg9mnd!nk9";
		System.out.println("Unique charas " + isUniqueChars(str));
	}
	
	public static boolean isUniqueChars(String str) {
		if(str!=null) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			for(int i=0; i < charArray.length-1; i++) {
				if(charArray[i]== charArray[i+1]) {
					return false;
				}
			}
					
		}
		return true;
	}

}
