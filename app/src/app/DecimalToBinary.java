package app;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number");
		int i = sc.nextInt();
		int[] x = new int[i];

		int index = 0;
		while (i > 0) {
			x[index++] = i % 2;
			i = i / 2;
		}
		for(int j=index-1;j>=0;j--)
		{
			System.out.print(x[j]+" ");
		}

	}

}
