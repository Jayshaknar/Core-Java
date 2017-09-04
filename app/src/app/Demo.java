package app;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		String str = "AHfB";

		System.out.println("String : " + str);

		str=str.toUpperCase();
		// Get character array of string.
		char[] charArray = str.toCharArray();

		// Sort the character array.
		Arrays.sort(charArray);

		System.out.println("Missing characters");

		// Iterate over character array.
		for (int i = 0; i < charArray.length - 1; i++) {

			// Find the difference between current char and next char.
			int charDiff = charArray[i + 1] - charArray[i];
			if (charDiff > 1) {

				for (int j = 1; j < charDiff; j++) {
					char c = (char) (charArray[i] + j);
					System.out.print(c + " ");
				}
			}
		}
	}

}