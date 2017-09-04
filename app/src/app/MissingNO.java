package app;

import java.util.Arrays;

public class MissingNO {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3, 5, 8, 6, 9 };
		System.out.println("No : " + Arrays.toString(x));
		Arrays.sort(x);

		System.out.println(Arrays.toString(x));
		System.out.println("Missing characters");

		for (int i = 0; i < x.length - 1; i++) {

			int Diff = x[i + 1] - x[i];
			//System.out.println("Diff is :"+Diff);
			if (Diff > 1) {

				for (int j = 1; j < Diff; j++) {

					System.out.print(x[i]+j +" ");
				}
			}
		}
	}

}
